package demo1;

//解决数组长度不可变的问题

import java.util.Arrays;

public class TestOpArray {

	public static void main(String[] args) {
		
		
		int[] orr = new int[] {9,8,7};
		//快速查看数组中的元素；
		System.out.println(Arrays.toString(orr));
		System.out.println(orr.length);
		//要加入的数组元素目标
		int dst = 6;
		
		//创建一个新的数组，长度为原数组长度加1
		int[] array = new int[orr.length+1];
		//把原数组中的数据全部复制到新数组中去
		for(int i=0;i<orr.length;i++) {
			array[i] = orr[i];
		}
		//把目标元素放到新数组的最后
		array[array.length-1] = dst;
		//新数组替换原数组
		orr = array;
		
		System.out.println(Arrays.toString(array));
		
	}

}
