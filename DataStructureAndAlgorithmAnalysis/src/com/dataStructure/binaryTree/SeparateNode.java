/*
 * 分别定义分支结点和叶结点
 */
package com.dataStructure.binaryTree;

public class SeparateNode {
	
	class LeafNode implements BinNode {  // 定义叶结点类
		private String var;
		
		public LeafNode(String var) {
			this.var = var;
		}
		
		@Override
		public Object element() {
			return var;
		}
		@Override
		public Object setElement(Object v) {
			return var = (String) v;
		}
		
		@Override
		public BinNode left() {
			return null;
		}
		@Override
		public BinNode setLeft(BinNode p) {
			return null;
		}
		
		@Override
		public BinNode right() {
			return null;
		}
		@Override
		public BinNode setRight(BinNode p) {
			return null;
		}
		
		@Override
		public boolean isLeaf() {
			return true;
		}
	}
	
	class IntlNode implements BinNode {  // 定义分支结点
		private BinNode left;
		private BinNode right;
		private Character opx;
		
		public IntlNode(Character opx, BinNode left, BinNode right) {
			this.opx = opx;
			this.left = left;
			this.right = right;
		}
		
		@Override
		public Object element() {
			return opx;
		}
		@Override
		public Object setElement(Object o) {
			return opx = (Character) o;
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
			return false;
		}
	}

}
