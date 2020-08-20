package p102;

import java.util.Arrays;

public class PriorityQueen {

	private int[] array;
	private int size;

	public PriorityQueen() {
		// ���� ��ʼ����Ϊ32
		array = new int[32];
	}

	/**
	 * ���
	 * 
	 * @param key
	 *            ���Ԫ��
	 */
	public void enQueue(int key) {
		// ���г��ȳ�����Χ,����
		if (size >= array.length) {
			resize();
		}
		array[size++] = key;
		upAdjust();
	}

	/**
	 * "�ϸ�"����
	 */
	private void upAdjust() {
		int childIndex = size - 1;
		int parentIndex = (childIndex - 1) / 2;
		// temp��������Ҷ�ӽڵ�ֵ,�������ĸ�ֵ
		int temp = array[childIndex];
		while (childIndex > 0 && temp > array[parentIndex]) {
			// ������������,����ֵ����
			array[childIndex] = array[parentIndex];
			childIndex = parentIndex;
			parentIndex = parentIndex / 2;
		}
		array[childIndex] = temp;
	}

	/**
	 * ��������
	 */
	private void resize() {
		// �������ݷ���
		int newSize = this.size * 2;
		this.array = Arrays.copyOf(this.array, newSize);
	}

	/**
	 * ����
	 * @return
	 * @throws Exception
	 */
	public int deQueue() throws Exception {
		if (size <= 0) {
			throw new Exception("the queue is empty!");
		}
		// ��ȡ�Ѷ�Ԫ��
		int head = array[0];
		// �����һ��Ԫ���ƶ����Ѷ�
		array[0] = array[--size];
		downAdjust();
		return head;
	}

	/**
	 * "�³�"����
	 */
	private void downAdjust() {
		// temp���游�ڵ��ֵ,�������ĸ�ֵ
		int parentIndex = 0;
		int temp = array[parentIndex];
		int childIndex = 1;
		while (childIndex < size) {
			// ������Һ���,���Һ��Ӵ������ӵ�ֵ,��λ���Һ���
			if (childIndex + 1 < size && array[childIndex + 1] > array[childIndex]) {
				childIndex++;
			}
			// ������ڵ�����κ�һ�����ӵ�ֵ,ֱ������
			if (temp > array[childIndex]) {
				break;
			}
			// ������������,����ֵ����
			array[parentIndex] = array[childIndex];
			parentIndex = childIndex;
			childIndex = 2 * childIndex + 1;
		}
		array[parentIndex] = temp;
	}

}
