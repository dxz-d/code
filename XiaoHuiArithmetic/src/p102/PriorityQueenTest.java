package p102;

public class PriorityQueenTest {

	public static void main(String[] args) throws Exception {
		PriorityQueen priorityQueen = new PriorityQueen();
		priorityQueen.enQueue(3);
		priorityQueen.enQueue(5);
		priorityQueen.enQueue(10);
		priorityQueen.enQueue(9);
		priorityQueen.enQueue(7);
		System.out.println("����Ԫ��:"+priorityQueen.deQueue());
		System.out.println("����Ԫ��:"+priorityQueen.deQueue());
	}

}
