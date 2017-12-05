package com.practice;

import com.dataStructure.binaryTree.BinNode;
import com.dataStructure.binaryTree.BinNodePtr;

public class SearchTree {
	
	static boolean boo = false;
	
	public static void main(String[] args) {
		// 构造树
		BinNode binTree = new BinNodePtr(1, 
				new BinNodePtr(2, new BinNodePtr(3), new BinNodePtr(4)), 
				new BinNodePtr(5, new BinNodePtr(6), new BinNodePtr(7)));
		
		int tar = 7;
		search(binTree, tar);
		if (boo) {
			System.out.println("Target Found");
		} else {
			System.out.println("Target not found");
		}
	}
	
	private static void search(BinNode rt, int k) {  // 使用前序遍历搜索
		if ((int) rt.element() == k) {
			boo = true;
			return;
		}
		if (rt.isLeaf()) {
			return;
		}
		search(rt.left(), k);
		search(rt.right(), k);
	}

}
