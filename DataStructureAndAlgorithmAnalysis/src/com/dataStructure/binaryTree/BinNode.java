/*
 * �������ڵ�ĳ�����������
 */
package com.dataStructure.binaryTree;

public interface BinNode {
	
	// ���غ�����Ԫ��ֵ
	public Object element();
	public Object setElement(Object v);
	
	// ���غ�����������
	public BinNode left();
	public BinNode setLeft(BinNode p);
	
	// ���غ�����������
	public BinNode right();
	public BinNode setRight(BinNode v);
	
	// �ж��Ƿ�ΪҶ�ӽ��
	public boolean isLeaf();

}
