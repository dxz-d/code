package demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHuffmanCode {

	public static void main(String[] args) {

		String msg = "Can you can a can as a can canner can a can.";
		byte[] bytes = msg.getBytes();
		//进行赫夫曼编码
		byte[] b = huffmanZip(bytes);
		//使用赫夫曼编码进行解码
		//byte[] newBytes = decode(huffCodes,b);
		/*byte b = 1;
		String s = byteToBitStr(b);
		System.out.println(s);*/
		
	}
	
	private static byte[] zip(byte[] bytes,Map<Byte, String> huffCodes) {
		StringBuilder sb = new StringBuilder();
		//把需要压缩的byte数组处理成一个二进制的字符串
		for(byte b:bytes) {
			sb.append(huffCodes.get(b));
		}
		
		System.out.println(sb.toString());
		//定义长度
		int len;
		if (sb.length()%8==0) {
			len=sb.length()/8;
		}else {
			len=sb.length()/8+1;
		}
		//用于存储压缩后的byte
		byte[] by = new byte[len];
		//记录新byte的位置
		int index = 0;
		return null;
	}
	
	private static String byteToBitStr(byte b) {
		int temp = b;
		temp|=256;
		String str = Integer.toBinaryString(temp);
		return str.substring(str.length()-8);
	}


	/**
	 * 使用赫夫曼编码进行解码
	 * @param huffCode2
	 * @param b
	 * @return
	 */
	private static byte[] decode(Map<Byte, String> huffCodes, byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		//把byte数组转为一个二进制的字符串
		for(int i=0;i<bytes.length;i++) {
			byte b = bytes[i];
			//是否是最后一个
			boolean flag = (i==bytes.length-1);
			sb.append(byteToBitStr(!flag,b));
		}
		//System.out.println(sb.toString());
		//把字符串按照指定的赫夫曼编码进行解密
		//把赫夫曼编码的键值进行调换
		Map<String, Byte> map = new HashMap<>();
		for(Map.Entry<Byte, String> entry:huffCodes.entrySet()) {
			map.put(entry.getValue(), entry.getKey());
		} 
		//创建一个集合，用于存byte
		ArrayList<Byte> list = new ArrayList<>();
		//处理字符串
		for(int i=0;i<sb.length();) {
			int count = 1;
			boolean flag = true;
			Byte b = null;
			//截取出一个byte
			while(flag) {
				String key = sb.substring(i, i+count);
				b = map.get(key);
				if (b==null) {
					count++;
				}else {
					flag = false;
				}
			}
			list.add(b);
			i+=count;
		}
		//把集合转为数据
		byte[] b = new byte[list.size()];
		for(int i=0;i<b.length;i++) {
			b[i]=list.get(i);
		}
		return b;
	}
	
	private static String byteToBitStr(boolean flag, byte b) {
		int temp = b;
		if (flag) {
			temp|=256;
		}
		String str = Integer.toBinaryString(temp);
		if (flag) {
			return str.substring(str.length()-8);
		}
		return str;
	}

	/**
	 * 进行赫夫曼编码压缩的方法
	 * @param bytes
	 * @return
	 */
	public static byte[] huffmanZip(byte[] bytes) {
		//先统计每一个byte出现的次数，并放入一个集合中
		List<Node> nodes = getNodes(bytes);
		//创建一棵赫夫曼树
		Node tree = createHuffmanTree(nodes);
		//创建一个赫夫曼编码表
		Map<Byte, String> huffCodes = getCodes(tree);
		//编码
		byte[] b = zip(bytes, huffCodes);
		return b;
	}

	private static Map<Byte, String> getCodes(Node tree) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 创建赫夫曼树
	 * @param nodes
	 * @return
	 */
	public static Node createHuffmanTree(List<Node> nodes) {
		while(nodes.size()>1) {
			//排序
			Collections.sort(nodes);
			//System.out.println(nodes);
			//取出两个权值最低的二叉树
			Node left = nodes.get(nodes.size()-1);
			Node right = nodes.get(nodes.size()-2);
			//创建一棵新的二叉树
			Node parent = new Node(null, left.weight+right.weight);
			//把之前取出来的两棵二叉树设置为新创建的二叉树的子树
			parent.left = left;
			parent.right = right;
			//把前面取出来的两棵二叉树删除
			nodes.remove(left);
			nodes.remove(right);
			//把新创建的二叉树放入集合中
			nodes.add(parent);
		}
		return nodes.get(0);
	}

	/**
	 * 把byte数组转化为node集合
	 * @param bytes
	 * @return
	 */
	public static List<Node> getNodes(byte[] bytes) {
		ArrayList<Node> nodes = new ArrayList<>();
		//存储每一个byte出现的次数
		HashMap<Byte, Integer> counts = new HashMap<>();
		//统计每一个byte出现的次数
		for(byte b:bytes) {
			Integer count = counts.get(b);
			if (count==null) {
				counts.put(b,1);
			}else {
				counts.put(b, count+1);
			}
		}
		//把每一个键值对转为一个node对象
		for(Map.Entry<Byte, Integer> entry:counts.entrySet()) {
			nodes.add(new Node(entry.getKey(), entry.getValue()));
		}
		//System.out.println(counts);{32=11, 97=11, 114=1, 67=1, 99=6, 115=1, 117=1, 101=1, 121=1, 110=8, 46=1, 111=1}
		return nodes;
	}

}
