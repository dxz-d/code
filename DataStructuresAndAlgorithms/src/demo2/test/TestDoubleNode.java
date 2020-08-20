package demo2.test;

import demo2.DoubleNode;

public class TestDoubleNode {

	public static void main(String[] args) {

		//创建节点
		DoubleNode d1 = new DoubleNode(1);
		DoubleNode d2 = new DoubleNode(2);
		DoubleNode d3 = new DoubleNode(3);
		
		//追加节点
		d1.after(d2);
		d2.after(d3);
		
		//查看上一个，自己，下一个节点的内容
		System.out.println(d1.pre().getData());
		System.out.println(d1.getData());
		System.out.println(d1.next().getData());
		System.out.println("============================");
		
		System.out.println(d2.pre().getData());
		System.out.println(d2.getData());
		System.out.println(d2.next().getData());
		System.out.println("============================");
		
		System.out.println(d3.pre().getData());
		System.out.println(d3.getData());
		System.out.println(d3.next().getData());
	}

}
