/*
 * 二叉树节点的抽象数据类型
 */
package com.dataStructure.binaryTree;

public interface BinNode {
	
	// 返回和设置元素值
	public Object element();
	public Object setElement(Object v);
	
	// 返回和设置左子树
	public BinNode left();
	public BinNode setLeft(BinNode p);
	
	// 返回和设置右子树
	public BinNode right();
	public BinNode setRight(BinNode v);
	
	// 判断是否为叶子结点
	public boolean isLeaf();

}
