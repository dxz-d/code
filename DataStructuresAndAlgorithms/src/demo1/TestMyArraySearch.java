package demo1;

import demo1.util.MyArray;

public class TestMyArraySearch {

	public static void main(String[] args) {
		
		MyArray ma = new MyArray();
		ma.add(1);
		ma.add(2);
		ma.add(3);
		ma.add(4);
		ma.add(5);
		//调用线性查找方法
		int index = ma.search(1);
		System.out.println("线性查找index:"+index);
		
		ma.show();
		//调用二分法查找
		int index2 = ma.binarySearch(5);
		System.out.println("二分法查找index2:"+index2);
	}
}
