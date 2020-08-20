package p30;

public class MyArray {

	private static int[] array;
	private static int size;

	public MyArray(int capacity) {
		this.array = new int[capacity];
		size = 0;
	}

	/**
	 * 数组插入元素
	 * 
	 * @param element
	 *            插入的元素
	 * @param index
	 *            插入的位置
	 */
	public void insert(int element, int index) {
		// 判断访问下标是否超出范围
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("超出数组实际元素范围！");
		}
		// 如果实际元素达到数组容量上限，则对数组进行扩展
		if (size >= array.length) {
			resize();
		}
		// 从右向左循环，将元素逐个向右挪1位
		for (int i = size - 1; i >= index; i--) {
			array[i + 1] = array[i];
		}
		// 腾出的位置放入新元素
		array[index] = element;
		size++;
	}

	/**
	 * 数组扩充
	 */
	public void resize() {
		int[] arrayNew = new int[array.length * 2];
		// 从旧数组复制到新数组
		System.arraycopy(array, 0, arrayNew, 0, array.length);
		array = arrayNew;
	}

	/**
	 * 输出数组
	 */
	public void outPut() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

	/**
	 * 数组删除元素
	 * 
	 * @param index
	 * @return
	 */
	public static int delete(int index) {
		// 判断访问下标是否超出范围
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("超出数组实际元素范围");
		}
		int deletedElement = array[index];
		// 从左向右循环，将元素逐个向左挪1位
		for (int i = index; i < size - 1; i++) {
			array[i] = array[i+1];
		}
		size--;
		return deletedElement;
	}

}
