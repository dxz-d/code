package demo11;

public class TestBinarySortTree {

	public static void main(String[] args) {
		int[] arr = new int[] {7,3,10,12,5,1,9};
		//创建一棵二叉排序树
		BinarySortTree bst = new BinarySortTree();
		//循环添加
		for(int i:arr) {
			bst.add(new Node(i));
		}
		//查看树中的值
		bst.middleShow();
		System.out.println("============");
		//查找
		/*Node node = bst.search(10);
		System.out.println(node.value);
		//
		Node node2 = bst.search(20);
		System.out.println(node2);
		//测试查找父节点
		Node p1 = bst.searchParent(1);
		System.out.println(p1.value);
		//删除叶子节点
		bst.delete(5);
		bst.middleShow();
		System.out.println("--------------");
		//删除只有一个子节点的节点
		bst.delete(3);
		bst.middleShow();*/
		bst.delete(7);
		System.out.println("=========");
		bst.middleShow();
	}

}
