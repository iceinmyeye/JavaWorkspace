package com.dataStructure.generalTree;

public class GenTree_Class { // general tree class for UNION/FIND
	private GTNode_Class[] array; // node array

	public GenTree_Class(int size) { // create node array
		array = new GTNode_Class[size];
		for (int i = 0; i < size; i++) {
			array[i] = new GTNode_Class(); // 自定义类型的数组，分配空间后须实例化，否则会出现空指针
		}
	}

	public boolean differ(int a, int b) { // nodes in different trees?
		GTNode_Class root1 = FIND(array[a]);
		GTNode_Class root2 = FIND(array[b]);
		return root1 != root2;
	}
	
	public void UNION(int a, int b) { // merge two subtrees
		GTNode_Class root1 = FIND(array[a]);  // find root of node a
		GTNode_Class root2 = FIND(array[b]);  // find root of node b
		if (root1 != root2) {
			root2.setParent(root1);           // compare roots
		}
	}
	
	public GTNode_Class FIND(GTNode_Class curr) { // find root
		while (curr.parent() != null) {
			curr = curr.parent();
		}
		return curr;
	}

}
