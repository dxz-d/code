package sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 5, 9, 4, 11, 56, 200  };
		System.out.println(Arrays.toString(array));
		bubbleSort(array);
	}

	public static void bubbleSort(int[] list) {
		// 用来交换的临时数
		int temp = 0;

		// 要遍历的次数
		for (int i = 0; i < list.length - 1; i++) {
			// 从后向前一次的比较相邻两个数的大小,遍历一次后,把数组中第i小的数放在第i个位置上
			for (int j = list.length - 1; j > i; j--) {
				// 比较相邻的元素,如果前面的数大于后面的数,则交换
				if (list[j - 1] > list[j]) {
					temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
				}
			}
			System.out.format("第 " + i + "趟:  ");
			System.out.println(Arrays.toString(list));
		}
	}

}
