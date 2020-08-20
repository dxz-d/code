package p144;

import java.util.Arrays;

public class OptimizeCountSort {

	public static void main(String[] args) {
		int[] array = new int[] { 95, 94, 91, 98, 99, 10, 99, 93, 91, 92 };
		int[] sortedArray = countSort(array);
		System.out.println(Arrays.toString(sortedArray));
	}

	private static int[] countSort(int[] array) {
		// 1.�õ����е����ֵ����Сֵ,���������ֵd
		int max = array[0];
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		int d = max - min;
		// 2.����ͳ�����鲢ͳ�ƶ�ӦԪ�صĸ���
		int[] countArray = new int[d + 1];
		for (int i = 0; i < array.length; i++) {
			countArray[array[i] - min]++;
		}

		// 3.ͳ������������,�����Ԫ�ص���ǰ���Ԫ��֮��
		for (int i = 1; i < countArray.length; i++) {
			countArray[i] += countArray[i - 1];
		}
		// 4.�������ԭʼ����,��ͳ�������ҵ���ȷλ��,������������
		int[] sortedArray = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			sortedArray[countArray[array[i] - min] - 1] = array[i];
			countArray[array[i] - min]--;
		}
		return sortedArray;
	}

}