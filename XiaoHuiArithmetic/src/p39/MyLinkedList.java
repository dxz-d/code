package p39;

public class MyLinkedList {

	// ͷ�ڵ�ָ��
	private Node head;
	// β�ڵ�ָ��
	private Node last;

	// ����ʵ�ʳ���
	private int size;

	/**
	 * �������Ԫ��
	 * 
	 * @param data
	 *            ����Ԫ��
	 * @param index
	 *            ����λ��
	 */
	public void insert(int data, int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("��������ڵ㷶Χ");
		}
		Node insertNode = new Node(data);
		if (size == 0) {
			// ������
			head = insertNode;
			last = insertNode;
		} else if (index == 0) {
			// ����ͷ��
			insertNode.next = head;
			head = insertNode;
		} else if (size==index) {
			//����β��
			last.next = insertNode;
			last = insertNode;
		} else {
			//�����м�
			Node prevNode = get(index-1);
			insertNode.next = prevNode.next;
			prevNode.next = insertNode;
		}
		size++;
	}

	/**
	 * �������λ��
	 * @param index	���ҵ�λ��
	 * @return
	 */
	public Node get(int index) {
		if (index<0||index>=size) {
			throw new IndexOutOfBoundsException("��������ڵ㷶Χ����");
		}
		Node temp = head;
		for(int i=0;i<index;i++) {
			temp = temp.next;
		}
		return temp;
	}

	/**
	 * ����ɾ��Ԫ��
	 * @param index	ɾ����λ��
	 * @return
	 */
	public Node remove(int index) {
		if (index<0||index>=size) {
			throw new IndexOutOfBoundsException("��������ڵ㷶Χ��");
		}
		Node removeNode = null;
		if (index==0) {
			//ɾ��ͷ�ڵ�
			removeNode = head;
			head = head.next;
		} else if (index==size-1) {
			//ɾ��β�ڵ�
			Node prevNode = get(index-1);
			removeNode = prevNode.next;
			prevNode.next = null;
			last = prevNode;
		} else {
			//ɾ���м�ڵ�
			Node prevNode = get(index-1);
			Node nextNode = prevNode.next.next;
			removeNode = prevNode.next;
			prevNode.next = nextNode;
		}
		size--;
		return removeNode;
	}
	
	/**
	 * �������
	 */
	public void output() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
