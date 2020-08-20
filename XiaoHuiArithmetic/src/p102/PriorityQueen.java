package p102;

import java.util.Arrays;

public class PriorityQueen {

	private int[] array;
	private int size;

	public PriorityQueen() {
		// 队列 初始长度为32
		array = new int[32];
	}

	/**
	 * 入队
	 * 
	 * @param key
	 *            入队元素
	 */
	public void enQueue(int key) {
		// 队列长度超出范围,扩容
		if (size >= array.length) {
			resize();
		}
		array[size++] = key;
		upAdjust();
	}

	/**
	 * "上浮"调整
	 */
	private void upAdjust() {
		int childIndex = size - 1;
		int parentIndex = (childIndex - 1) / 2;
		// temp保存插入的叶子节点值,用于最后的赋值
		int temp = array[childIndex];
		while (childIndex > 0 && temp > array[parentIndex]) {
			// 无须真正交换,单向赋值即可
			array[childIndex] = array[parentIndex];
			childIndex = parentIndex;
			parentIndex = parentIndex / 2;
		}
		array[childIndex] = temp;
	}

	/**
	 * 队列扩容
	 */
	private void resize() {
		// 队列扩容翻倍
		int newSize = this.size * 2;
		this.array = Arrays.copyOf(this.array, newSize);
	}

	/**
	 * 出队
	 * @return
	 * @throws Exception
	 */
	public int deQueue() throws Exception {
		if (size <= 0) {
			throw new Exception("the queue is empty!");
		}
		// 获取堆顶元素
		int head = array[0];
		// 让最后一个元素移动到堆顶
		array[0] = array[--size];
		downAdjust();
		return head;
	}

	/**
	 * "下沉"调整
	 */
	private void downAdjust() {
		// temp保存父节点的值,用于最后的赋值
		int parentIndex = 0;
		int temp = array[parentIndex];
		int childIndex = 1;
		while (childIndex < size) {
			// 如果有右孩子,且右孩子大于左孩子的值,则定位到右孩子
			if (childIndex + 1 < size && array[childIndex + 1] > array[childIndex]) {
				childIndex++;
			}
			// 如果父节点大于任何一个孩子的值,直接跳出
			if (temp > array[childIndex]) {
				break;
			}
			// 无须真正交换,单向赋值即可
			array[parentIndex] = array[childIndex];
			parentIndex = childIndex;
			childIndex = 2 * childIndex + 1;
		}
		array[parentIndex] = temp;
	}

}
