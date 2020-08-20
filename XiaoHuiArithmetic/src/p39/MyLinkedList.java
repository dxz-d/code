package p39;

public class MyLinkedList {

	// 头节点指针
	private Node head;
	// 尾节点指针
	private Node last;

	// 链表实际长度
	private int size;

	/**
	 * 链表插入元素
	 * 
	 * @param data
	 *            插入元素
	 * @param index
	 *            插入位置
	 */
	public void insert(int data, int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("超出链表节点范围");
		}
		Node insertNode = new Node(data);
		if (size == 0) {
			// 空链表
			head = insertNode;
			last = insertNode;
		} else if (index == 0) {
			// 插入头部
			insertNode.next = head;
			head = insertNode;
		} else if (size==index) {
			//插入尾部
			last.next = insertNode;
			last = insertNode;
		} else {
			//插入中间
			Node prevNode = get(index-1);
			insertNode.next = prevNode.next;
			prevNode.next = insertNode;
		}
		size++;
	}

	/**
	 * 链表查找位置
	 * @param index	查找的位置
	 * @return
	 */
	public Node get(int index) {
		if (index<0||index>=size) {
			throw new IndexOutOfBoundsException("超出链表节点范围！！");
		}
		Node temp = head;
		for(int i=0;i<index;i++) {
			temp = temp.next;
		}
		return temp;
	}

	/**
	 * 链表删除元素
	 * @param index	删除的位置
	 * @return
	 */
	public Node remove(int index) {
		if (index<0||index>=size) {
			throw new IndexOutOfBoundsException("超出链表节点范围！");
		}
		Node removeNode = null;
		if (index==0) {
			//删除头节点
			removeNode = head;
			head = head.next;
		} else if (index==size-1) {
			//删除尾节点
			Node prevNode = get(index-1);
			removeNode = prevNode.next;
			prevNode.next = null;
			last = prevNode;
		} else {
			//删除中间节点
			Node prevNode = get(index-1);
			Node nextNode = prevNode.next.next;
			removeNode = prevNode.next;
			prevNode.next = nextNode;
		}
		size--;
		return removeNode;
	}
	
	/**
	 * 输出链表
	 */
	public void output() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
