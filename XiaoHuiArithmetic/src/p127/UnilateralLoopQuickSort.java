package p127;

import java.util.Arrays;

public class UnilateralLoopQuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 4, 6, 5, 3, 2, 8, 1 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int startIndex, int endIndex) {
		// �ݹ��������:startIndex���ڻ����endIndexʱ
		if (startIndex >= endIndex) {
			return;
		}
		// �õ���׼Ԫ��λ��
		int pivotIndex = partition(arr, startIndex, endIndex);
		// ���ݻ�׼Ԫ��,�ֳ������ֽ��еݹ�����
		quickSort(arr, startIndex, pivotIndex - 1);
		quickSort(arr, pivotIndex + 1, endIndex);
	}

	/**
	 * ����(����ѭ����)
	 * 
	 * @param arr
	 *            ������������
	 * @param startIndex
	 *            ��ʼ�±�
	 * @param endIndex
	 *            �����±�
	 */
	private static int partition(int[] arr, int startIndex, int endIndex) {
		// ȡ��1��λ��(Ҳ����ѡ�����λ��)��Ԫ����Ϊ��׼Ԫ��
		int pivot = arr[startIndex];
		int mark = startIndex;

		for (int i = startIndex + 1; i <= endIndex; i++) {
			if (arr[i] < pivot) {
				mark++;
				int p = arr[mark];
				arr[mark] = arr[i];
				arr[i] = p;
			}
		}

		arr[startIndex] = arr[mark];
		arr[mark] = pivot;
		return mark;
	}

}