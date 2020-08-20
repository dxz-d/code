package p114;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arrar = new int[] { 3, 4, 2, 1, 5, 6, 7, 8 };
		sort(arrar);
		System.out.println(Arrays.toString(arrar));
	}

	private static void sort(int[] arrar) {
		// ��¼���һ�ν�����λ��
		int lastExchangeIndex = 0;
		// �����б�ı߽�,ÿ�αȽ�ֻ��Ҫ�ȵ�����Ϊֹ
		int sortBorder = arrar.length - 1;
		for (int i = 0; i < arrar.length - 1; i++) {
			// ������,ÿһ�ֵĳ�ʼֵ����true
			boolean isSorted = true;
			for (int j = 0; j < sortBorder; j++) {
				int temp = 0;
				if (arrar[j] > arrar[j + 1]) {
					temp = arrar[j];
					arrar[j] = arrar[j + 1];
					arrar[j + 1] = temp;
					// ��Ϊ��Ԫ�ؽ��н���,���Բ��������,��Ǳ�Ϊfalse
					isSorted = false;
					// ����Ϊ���һ�ν���Ԫ�ص�λ��
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
