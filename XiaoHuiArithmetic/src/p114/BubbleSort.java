package p114;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arrar = new int[] { 3, 4, 2, 1, 5, 6, 7, 8 };
		sort(arrar);
		System.out.println(Arrays.toString(arrar));
	}

	private static void sort(int[] arrar) {
		// 记录最后一次交换的位置
		int lastExchangeIndex = 0;
		// 无序列表的边界,每次比较只需要比到这里为止
		int sortBorder = arrar.length - 1;
		for (int i = 0; i < arrar.length - 1; i++) {
			// 有序标记,每一轮的初始值都是true
			boolean isSorted = true;
			for (int j = 0; j < sortBorder; j++) {
				int temp = 0;
				if (arrar[j] > arrar[j + 1]) {
					temp = arrar[j];
					arrar[j] = arrar[j + 1];
					arrar[j + 1] = temp;
					// 因为有元素进行交换,所以不是有序的,标记变为false
					isSorted = false;
					// 更新为最后一次交换元素的位置
					lastExchangeIndex = j;
				}
			}
			sortBorder = lastExchangeIndex;
			if (isSorted) {
				break;
			}
		}
	}

}
