package demo7;

public class ThreadNode {

	//节点的权
	int value;
	//左儿子
	ThreadNode leftNode;
	//右儿子
	ThreadNode rightNode;
	//标识指针类型
	int leftType;
	int rightType;
	
	public ThreadNode(int value) {
		this.value=value;
	}

	//设置左儿子
	public void setLeftNode(ThreadNode leftNode) {
		this.leftNode = leftNode;
	}
	
	//设置右儿子
	public void setRightNode(ThreadNode rightNode) {
		this.rightNode = rightNode;
	}

	//前序遍历
	public void frontShow() {

		//先遍历当前节点的内容
		System.out.println(value);
		//左节点
		if (leftNode!=null) {
			leftNode.frontShow();
		}
		//右节点
		if (rightNode!=null) {
			rightNode.frontShow();
		}
	}
	
	//中序遍历
	public void midShow(){
		//左子节点
		if (leftNode!=null) {
			leftNode.midShow();
		}
		//当前节点
		System.out.println(value);
		//右节点
		if (rightNode!=null) {
			rightNode.midShow();
		}
	}

	public void afterShow() {

		//左子节点
		if (leftNode!=null) {
			leftNode.midShow();
		}
		//右子节点
		if (rightNode!=null) {
			rightNode.midShow();
		}
		//当前节点
		System.out.println(value);
	}
	
	public ThreadNode frontSearch(int i) {
		ThreadNode target = null;
		//对比当前节点的值
		if (this.value==i) {
			return this;
		//当前节点的值不是要查找的节点
		}else {
			//查找左儿子
			if (leftNode!=null) {
				//有可能可以查到，也可以查不到，查不到的话，target还是一个null
				target = leftNode.frontSearch(i);
			}
			//如果不为空，说明左儿子已经找到
			if (target!=null) {
				return target;
			}
			//查找右儿子
			if (rightNode!=null) {
				target = rightNode.frontSearch(i);
			}
		}
		return target;
	}

	//删除一个字树
	public void delete(int i) {
		ThreadNode parent = this;
		//判断左儿子
		if (parent.leftNode!=null&&parent.leftNode.value==i) {
			parent.leftNode=null;
			return;
		}
		//判断右儿子
		if (parent.rightNode!=null&&parent.rightNode.value==i) {
			parent.rightNode=null;
			return;
		}
		//递归检查并删除左儿子
		parent=leftNode;
		if (parent!=null) {
			parent.delete(i);
		}
		//递归检查并删除右儿子
		parent=rightNode;
		if (parent!=null) {
			parent.delete(i);
		}
	}
}
