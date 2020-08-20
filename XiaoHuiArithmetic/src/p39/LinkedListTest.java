package p39;

public class LinkedListTest {

	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.insert(3, 0);
		myLinkedList.insert(7, 1);
		myLinkedList.insert(9, 2);
		myLinkedList.insert(5, 3);
		myLinkedList.insert(6, 1);
		myLinkedList.remove(0);
		myLinkedList.output();
	}

}
