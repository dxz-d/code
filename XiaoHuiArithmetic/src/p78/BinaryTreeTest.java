package p78;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTreeTest {

	public static void main(String[] args) {
		LinkedList<Integer> inputList = new LinkedList<Integer>(
				Arrays.asList(new Integer[] { 3, 2, 9, null, null, 10, null, null, 8, null, 4 }));
		TreeNode treeNode = createBinaryTree(inputList);
		System.out.println("ǰ�������");
		preOrderTraveral(treeNode);
		System.out.println("���������");
		inOrderTraveral(treeNode);
		System.out.println("�������");
		postOrderTraveral(treeNode);
		System.out.println("�������ǵݹ�ǰ������");
		preOrderTraveralWithStack(treeNode);
		System.out.println("�������������");
		levelOrderTraversal(treeNode);
	}

	/**
	 * �������������
	 * 
	 * @param root
	 *            ���������ڵ�
	 */
	public static void levelOrderTraversal(TreeNode root) {
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.println(node.data);
			if (node.leftChird != null) {
				queue.offer(node.leftChird);
			}
			if (node.rightChird != null) {
				queue.offer(node.rightChird);
			}
		}
	}

	/**
	 * �������ǵݹ�ǰ�����
	 * 
	 * @param root
	 */
	public static void preOrderTraveralWithStack(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode treeNode = root;
		while (treeNode != null || !stack.isEmpty()) {
			// �������ʽڵ�����ӣ�����ջ
			while (treeNode != null) {
				System.out.println(treeNode.data);
				stack.push(treeNode);
				treeNode = treeNode.leftChird;
			}
			// ����ڵ�û�����ӣ��򵯳�ջ���ڵ㣬���ʽڵ��Һ���
			if (!stack.isEmpty()) {
				treeNode = stack.pop();
				treeNode = treeNode.rightChird;
			}
		}
	}

	/**
	 * �������������
	 * 
	 * @param node
	 *            �������ڵ�
	 */
	public static void postOrderTraveral(TreeNode node) {
		if (node == null) {
			return;
		}
		postOrderTraveral(node.leftChird);
		postOrderTraveral(node.rightChird);
		System.out.println(node.data);
	}

	/**
	 * �������������
	 * 
	 * @param node
	 *            �������ڵ�
	 */
	public static void inOrderTraveral(TreeNode node) {
		if (node == null) {
			return;
		}
		inOrderTraveral(node.leftChird);
		System.out.println(node.data);
		inOrderTraveral(node.rightChird);
	}

	/**
	 * ������ǰ�����
	 * 
	 * @param node
	 *            �������ڵ�
	 */
	public static void preOrderTraveral(TreeNode node) {
		if (node == null) {
			return;
		}
		System.out.println(node.data);
		preOrderTraveral(node.leftChird);
		preOrderTraveral(node.rightChird);
	}

	/**
	 * ����������
	 * 
	 * @param inputList
	 *            ��������
	 * @return
	 */
	public static TreeNode createBinaryTree(LinkedList<Integer> inputList) {
		TreeNode node = null;
		if (inputList == null || inputList.isEmpty()) {
			return null;
		}
		Integer data = inputList.removeFirst();
		if (data != null) {
			node = new TreeNode(data);
			node.leftChird = createBinaryTree(inputList);
			node.rightChird = createBinaryTree(inputList);
		}
		return node;
	}

}
