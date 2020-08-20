package demo4;

import java.util.Arrays;

/**
 * 
 * @author 刁秀泽
 * 希尔排序
 */
public class ShellSort {

	public static void main(String[] args) {

		int[] arr= new int[]{3,22,6,1,6,10,80,9,0};
		System.out.println(Arrays.toString(arr));
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void shellSort(int[] arr) {
		int k = 1;
		//遍历所有的步长
		for (int d = arr.length/2; d >0; d/=2) {
			//遍历所有的元素
			for(int i=d;i<arr.length;i++) {
				//遍历本组所有的元素
				for(int j=i-d;j>=0;j-=d) {
					//如果当前元素大于加上步长后的那个元素x
					if (arr[j]>arr[j+d]) {
						int temp = arr[j];
						arr[j] = arr[j+d];
						arr[j+d] = temp;
					}
				}
			}
			System.out.println("第"+k+"次排序结果："+Arrays.toString(arr));
			k++;
		}
	}

}
