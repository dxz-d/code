package p49;

public class MyQueue {

	private int[] array;
	private int front;
	private int rear;
	
	public MyQueue(int capacity) {
		this.array = new int[capacity];
	}

	/**
	 * ����
	 * @param element	���е�Ԫ��
	 * @throws Exception 
	 */
	public void enQueue(int element) throws Exception {
		if ((rear+1)%array.length==front) {
			throw new Exception("��������");
		}
		array[rear] = element;
		rear = (rear+1)%array.length;
	}

	/**
	 * ����
	 * @return
	 * @throws Exception 
	 */
	public int deQueue() throws Exception {
		if (rear==front) {
			throw new Exception("�����ѿ�");
		}
		int deQueueElement = array[front];
		front = (front+1)%array.length;
		return deQueueElement;
	}

	/**
	 * ������� 
	 */
	public void output() {
		for(int i=front;i!=rear;i=(i+1)%array.length) {
			System.out.println(array[i]);
		}
	}
}
