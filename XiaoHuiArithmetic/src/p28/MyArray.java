package p28;

public class MyArray {

	private int[] array;
	private int size;

	public MyArray(int capacity) {
		this.array = new int[capacity];
		size = 0;
	}

	/**
	 * �������Ԫ��
	 * 
	 * @param element
	 *            �����Ԫ��
	 * @param index
	 *            �����λ��
	 */
	public void insert(int element, int index) {
		// �жϷ����±��Ƿ񳬳���Χ
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("��������ʵ��Ԫ�ط�Χ��");
		}
		// ��������ѭ������Ԫ���������Ų1λ
		for (int i = size - 1; i >= index; i--) {
			array[i + 1] = array[i];
		}
		// �ڳ���λ�÷�����Ԫ��
		array[index] = element;
		size++;
	}

	/**
	 * �������
	 */
	public void outPut() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

}
