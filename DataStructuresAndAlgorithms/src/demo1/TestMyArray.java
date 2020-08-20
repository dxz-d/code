package demo1;

//数组的增删改查

import demo1.util.MyArray;

public class TestMyArray {

	public static void main(String[] args) {
		
		//创建一个可变的数组
		MyArray ma = new MyArray();
		//获取长度
		int size = ma.size();
		System.out.println("数组长度为空的话显示为:"+size);
		//System.out.print("数组长度为空的话显示所有为:");
		/***********BUG*************/
		//ma.show();
		//往数组中添加一个元素
		ma.add(99);
		ma.add(98);
		ma.add(97);
		
		//显示所有可变数组中的所有元素到控制台
		System.out.print("显示所有功能:");
		ma.show();
		
		//括号内为要删除元素的下标
		ma.delete(1);
		System.out.print("再次显示所有元素:");
		ma.show();
		
		//取出指位置的元素
		int element = ma.get(1);
		System.out.println("取出的指定元素为:"+element);
		
		System.out.println("============================");
		ma.add(96);
		ma.add(95);
		ma.add(94);
		System.out.print("更改后的显示所有:");
		ma.show();
		
		//插入元素到指定位置
		ma.insert(1,888888888);
		System.out.print("插入元素到指定位置之后的结果为:");
		ma.show();
		
		//替换指定位置的元素
		System.out.println("======================");
		ma.set(5, 555555555);
		System.out.print("替换指定位置的元素结果为:");
		ma.show();
	}
}
