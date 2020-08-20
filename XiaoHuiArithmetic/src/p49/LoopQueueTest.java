package p49;

public class LoopQueueTest {

	public static void main(String[] args) throws Exception  {
		
			MyQueue myQueue = new MyQueue(6);
			myQueue.enQueue(3);
			myQueue.enQueue(5);
			myQueue.enQueue(6);
			myQueue.enQueue(8);
			myQueue.enQueue(1);
			myQueue.deQueue();
			myQueue.deQueue();
			myQueue.deQueue();
			myQueue.enQueue(2);
			myQueue.enQueue(4);
			myQueue.enQueue(9);
			myQueue.output();
	} 

}
