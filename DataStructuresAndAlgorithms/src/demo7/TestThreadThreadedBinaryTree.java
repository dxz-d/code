package demo7;


public class TestThreadThreadedBinaryTree {

	public static void main(String[] args) {

		//创建一棵树
		ThreadedBinaryTree binTree = new ThreadedBinaryTree();
		//创建一个根节点
		ThreadNode root = new ThreadNode(1);
		//把根节点赋给树
		binTree.setRoot(root);
		//创建一个左节点
		ThreadNode rootL = new ThreadNode(2);
		//把新创建的节点设置为根节点的子节点
		root.setLeftNode(rootL);
		//创建一个右节点
		ThreadNode rootR = new ThreadNode(3);
		//把新创建的节点设置为根节点的子节点
		root.setRightNode(rootR);
		//为第二层的左节点创建两个子节点
		rootL.setLeftNode(new ThreadNode(4));
		ThreadNode fiveNode = new ThreadNode(5);
		rootL.setRightNode(fiveNode);
		//为第二层的右节点创建两个子节点
		rootR.setLeftNode(new ThreadNode(6));
		rootR.setRightNode(new ThreadNode(7));
		//前序遍历树
		binTree.frontShow();
		//System.out.println("=======1111111111111111111======================");
		//中序遍历树
		//binTree.midShow();
		System.out.println("=======222222222222222222222===========================");
		//后序遍历
		//binTree.afterShow();
		//System.out.println("===========33333333333333333333333==================");

				
		//中前线索话二叉树
		binTree.threadNodes();
		//获取5节点的后继节点
		//ThreadNode afterFive = fiveNode.rightNode;
		//System.out.println(afterFive.value);
	}

}
