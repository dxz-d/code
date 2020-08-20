package p117;

import java.util.Arrays;

public class Cocktail {

	public static void main(String[] args) {
		int[] array = new int[] { 2, 3, 4, 5, 6, 7, 8, 1 };
		sort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void sort(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length / 2; i++) {
			// ������,ÿһ�ֵĳ�ʼֵ����true
			boolean isSorted = true;
			// ������,�������ұȽϺͽ���
			for (int j = i; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					// ��Ԫ�ؽ���,���Բ��������,���Ϊfalse
					isSorted = false;
				}
			}
			if (isSorted) {
				break;
			}
			// ��ż����֮ǰ,��isSorted���±��Ϊtrue
			isSorted = true;
			// ż����,��������ȽϺͽ���
			for (int j = array.length - i - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					// ��Ϊ��Ԫ�ؽ��н���,���Բ�������� ,��Ǳ�Ϊfalse
					isSorted = false;
				}
			}
			if (isSorted) {
				break;
			}
		}
	}

}