package p49;

public class MyQueue {

	private int[] array;
	private int front;
	private int rear;
	
	public MyQueue(int capacity) {
		this.array = new int[capacity];
	}

	/**
	 * 入列
	 * @param element	入列的元素
	 * @throws Exception 
	 */
	public void enQueue(int element) throws Exception {
		if ((rear+1)%array.length==front) {
			throw new Exception("队列已满");
		}
		array[rear] = element;
		rear = (rear+1)%array.length;
	}

	/**
	 * 出队
	 * @return
	 * @throws Exception 
	 */
	public int deQueue() throws Exception {
		if (rear==front) {
			throw new Exception("队列已空");
		}
		int deQueueElement = array[front];
		front = (front+1)%array.length;
		return deQueueElement;
	}

	/**
	 * 输出队列 
	 */
	public void output() {
		for(int i=front;i!=rear;i=(i+1)%array.length) {
			System.out.println(array[i]);
		}
	}
}
