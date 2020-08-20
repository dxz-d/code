package sort;

import java.util.Arrays;

public class BubbleSort1 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 5, 9, 4, 11, 56, 200 };
		System.out.println(Arrays.toString(array));
		bubbleSort_2(array);
	}

	// 对bubbleSort的优化算法
	public static void bubbleSort_2(int[] list) {
		// 用来交换的临时数
		int temp = 0;
		// 交换标志
		boolean bChange = false;

		// 要遍历的次数
		for (int i = 1; i < list.length - 1; i++) {
			bChange = false;
			// 从后往前一次的比较相邻两个数的大小,遍历一次后,把数组中第i小的数放在第i个位置上
			for (int j = list.length - 1; j > i; j--) {
				// 比较相邻的元素,如果前面的数大于后面的数,则交换
				if (list[j - 1] > list[j]) {
					temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
					bChange = true;
				}
			}
			// 如果标志为false,说明本轮没有交换,已经是有序数列,可以结束排序
			if (false == bChange)
				break;

			System.out.print("第" + i + "趟:");
			System.out.println(Arrays.toString(list));
		}

	}

}
