package p96;

import java.util.Arrays;

public class BinaryHeapTest {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 2, 6, 5, 7, 8, 9, 10, 0 };
		upAdjust(array);
		System.out.println(Arrays.toString(array));
		
		array = new int[] { 7, 1, 3, 10, 5, 2, 8, 9, 6 };
		buildHeap(array);
		System.out.println(Arrays.toString(array));
	}

	/**
	 * ������
	 * 
	 * @param array
	 *            �������Ķ�
	 */
	public static void buildHeap(int[] array) {
		// �����һ����Ҷ�ӽڵ㿪ʼ,������"�³�"����
		for (int i = (array.length - 2) / 2; i >= 0; i--) {
			downAdjust(array, i, array.length);
		}
	}

	/**
	 * "�³�"����
	 * 
	 * @param array
	 *            �������Ķ�
	 * @param parentIndex
	 *            Ҫ"�³�"�ĸ��ڵ�
	 * @param length
	 *            �ѵ���Ч��С
	 */
	public static void downAdjust(int[] array, int parentIndex, int length) {
		// temp���游�ڵ�ֵ,�������ĸ�ֵ
		int temp = array[parentIndex];
		int childIndex = 2 * parentIndex + 1;
		while (childIndex < length) {
			// ������Һ���,���Һ���С�����ӵ�ֵ,��λ���Һ���
			if (childIndex + 1 < length && array[childIndex + 1] < array[childIndex]) {
				childIndex++;
			}
			// ������ڵ�С���κ�һ�����ӵ�ֵ,��ֱ������
			if (temp <= array[childIndex]) {
				break;
			}
			// ������������,����ֵ����
			array[parentIndex] = array[childIndex];
			parentIndex = childIndex;
			childIndex = 2 * childIndex + 1;
		}
		array[parentIndex] = temp;
	}

	/**
	 * "�ϸ�"����
	 * 
	 * @param array
	 *            �������Ķ�
	 */
	public static void upAdjust(int[] array) {
		int childIndex = array.length - 1;
		int parentIndex = (childIndex - 1) / 2;
		// temp��������Ҷ�ӽڵ�ֵ,�������ĸ�ֵ
		int temp = array[childIndex];
		while (childIndex > 0 && temp < array[parentIndex]) {
			// ������������,����ֵ����
			array[childIndex] = array[parentIndex];
			childIndex = parentIndex;
			parentIndex = (parentIndex - 1) / 2;
		}
		array[childIndex] = temp;
	}

}
