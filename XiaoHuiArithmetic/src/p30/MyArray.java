package p30;

public class MyArray {

	private static int[] array;
	private static int size;

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
		// ���ʵ��Ԫ�شﵽ�����������ޣ�������������չ
		if (size >= array.length) {
			resize();
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
	 * ��������
	 */
	public void resize() {
		int[] arrayNew = new int[array.length * 2];
		// �Ӿ����鸴�Ƶ�������
		System.arraycopy(array, 0, arrayNew, 0, array.length);
		array = arrayNew;
	}

	/**
	 * �������
	 */
	public void outPut() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

	/**
	 * ����ɾ��Ԫ��
	 * 
	 * @param index
	 * @return
	 */
	public static int delete(int index) {
		// �жϷ����±��Ƿ񳬳���Χ
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("��������ʵ��Ԫ�ط�Χ");
		}
		int deletedElement = array[index];
		// ��������ѭ������Ԫ���������Ų1λ
		for (int i = index; i < size - 1; i++) {
			array[i] = array[i+1];
		}
		size--;
		return deletedElement;
	}

}
