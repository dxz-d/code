package p78;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTreeTest {

	public static void main(String[] args) {
		LinkedList<Integer> inputList = new LinkedList<Integer>(
				Arrays.asList(new Integer[] { 3, 2, 9, null, null, 10, null, null, 8, null, 4 }));
		TreeNode treeNode = createBinaryTree(inputList);
		System.out.println("前序遍历：");
		preOrderTraveral(treeNode);
		System.out.println("中序遍历：");
		inOrderTraveral(treeNode);
		System.out.println("后序遍历");
		postOrderTraveral(treeNode);
		System.out.println("二叉树非递归前序排序");
		preOrderTraveralWithStack(treeNode);
		System.out.println("二叉树层序遍历");
		levelOrderTraversal(treeNode);
	}

	/**
	 * 二叉树层序遍历
	 * 
	 * @param root
	 *            二叉树根节点
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
	 * 二叉树非递归前序遍历
	 * 
	 * @param root
	 */
	public static void preOrderTraveralWithStack(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode treeNode = root;
		while (treeNode != null || !stack.isEmpty()) {
			// 迭代访问节点的左孩子，并入栈
			while (treeNode != null) {
				System.out.println(treeNode.data);
				stack.push(treeNode);
				treeNode = treeNode.leftChird;
			}
			// 如果节点没有左孩子，则弹出栈顶节点，访问节点右孩子
			if (!stack.isEmpty()) {
				treeNode = stack.pop();
				treeNode = treeNode.rightChird;
			}
		}
	}

	/**
	 * 二叉树后序遍历
	 * 
	 * @param node
	 *            二叉树节点
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
	 * 二叉树中序遍历
	 * 
	 * @param node
	 *            二叉树节点
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
	 * 二叉树前序遍历
	 * 
	 * @param node
	 *            二叉树节点
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
	 * 构建二叉树
	 * 
	 * @param inputList
	 *            输入序列
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
