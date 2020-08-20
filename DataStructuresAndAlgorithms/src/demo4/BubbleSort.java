package demo4;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = new int[] {3,2,1,4,2,67,4,7,9,8};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * 冒泡排序
	 * @param arr
	 * 3,2,1,4,2,,67,4,7,9,8  
	 * 共需要比较的轮数length-1
	 * 共需要比较的次数leng-1-轮数
	 */
	public static void bubbleSort(int[] arr) {
		//控制一共比较多少轮
		for (int i = 0; i < arr.length-1; i++) {
			//控制比较的次数
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}	
		}
	}
}
