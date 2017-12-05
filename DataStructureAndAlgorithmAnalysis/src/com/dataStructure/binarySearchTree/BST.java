package com.dataStructure.binarySearchTree;

import com.dataStructure.binaryTree.BinNode;
import com.dataStructure.binaryTree.BinNodePtr;

public class BST {  // Binary search tree implementation

	private BinNode root;  // The root of the tree
	
	public BST() {
		root = null;  // Initialize root to null
	}
	public void clear() {
		root = null;  // Throw the nodes away
	}
	public void insert(Elem val) {
		root = insertHelp(root, val);
	}
	public void remove(int key) {
		root = removeHelp(root, key);
	}
	public Elem find(int key) {
		return findHelp(root, key);
	}
	public boolean isEmpty() {
		return root == null;
	}
	public void print() {
		if (root == null) {
			System.out.println("The BST is empty");
		} else {
			printHelp(root, 0);
			System.out.println();
		}
	}
	
	// �ڶ����������дӸ��ڵ�Ѱ�Ҽ���ֵ
	private Elem findHelp(BinNode rt, int key) {
		if (rt == null) return null;
		Elem it = (Elem) rt.element();
		if (it.key() > key) return findHelp(rt.left(), key);
		else if (it.key() < key) return findHelp(rt.right(), key);
		else return it;
	}
	
	// ����ڵ�
	private BinNode insertHelp(BinNode rt, Elem val) {
		if (rt == null) return new BinNodePtr(val);
		Elem it = (Elem) rt.element();
		
		if (it.key() > val.key()) {
			rt.setLeft(insertHelp(rt.left(), val));
		} else {
			rt.setRight(insertHelp(rt.right(), val));
		}
		return rt;
	}
	
	// ɾ��BST�еĽ��
	private BinNode removeHelp(BinNode rt, int key) {
		if (rt == null) return null;
		Elem it = (Elem) rt.element();
		if (key < it.key()) {
			rt.setLeft(removeHelp(rt.left(), key));
		} else if (key > it.key()) {
			rt.setRight(removeHelp(rt.right(), key));
		} else {
			if (rt.left() == null) {
				return rt.right();
			} else if (rt.right() == null) {
				return rt.left();
			} else {
				Elem temp = getMin(rt.right());
				rt.setElement(temp);
				rt.setRight(deleteMin(rt.right()));
			}
		}
		return rt;
	}
	
	// Ѱ���Լ�ɾ����Сֵ�Ľ��
	private Elem getMin(BinNode rt) {
		if (rt.left() == null) {
			return (Elem) rt.element();
		} else {
			return getMin(rt.left());
		}
	}
	private BinNode deleteMin(BinNode rt) {
		if (rt.left() == null) {
			return rt.right();
		} else {
			rt.setLeft(deleteMin(rt.left()));
			return rt;
		}
	}
	
	// �����������С�����ӡ���ֵ
	private void printHelp(BinNode rt, int level) {
		if (rt == null) {
			return;
		}
		printHelp(rt.left(), level + 1);
		
		for (int i = 0; i < level; i++) {
			System.out.println(" ");
		}
		System.out.println((Elem) rt.element());
		printHelp(rt.right(), level + 1);
	}
}
