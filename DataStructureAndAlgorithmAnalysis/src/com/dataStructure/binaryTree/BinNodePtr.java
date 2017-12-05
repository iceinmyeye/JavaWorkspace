/*
 * 二叉树节点类，包含指向子类的指针
 */
package com.dataStructure.binaryTree;

public class BinNodePtr implements BinNode {
	private Object element;
	private BinNode left;
	private BinNode right;
	
	public BinNodePtr() {
		left = right = null;
	}
	public BinNodePtr(Object val) {
		left = right = null;
		element = val;
	}
	public BinNodePtr(Object val, BinNode l, BinNode r) {
		left = l;
		right = r;
		element = val;
	}
	
	@Override
	public Object element() {
		return element;
	}
	@Override
	public Object setElement(Object v) {
		return element = v;
	}
	
	@Override
	public BinNode left() {
		return left;
	}
	@Override
	public BinNode setLeft(BinNode p) {
		return left = p;
	}
	
	@Override
	public BinNode right() {
		return right;
	}
	@Override
	public BinNode setRight(BinNode p) {
		return right = p;
	}
	
	@Override
	public boolean isLeaf() {
		return (left == null) && (right == null);
	}

}
