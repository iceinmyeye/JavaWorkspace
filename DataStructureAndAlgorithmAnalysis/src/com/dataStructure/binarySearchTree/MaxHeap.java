/*
 * 堆
 * 1. 完全二叉树，可以用数组来实现
 * 2. 堆中存储的数据是局部有序的，即结点存储的值与其子结点存储的值之间存在某种联系
 * 该例为最大值堆
 */
package com.dataStructure.binarySearchTree;

public class MaxHeap {
	private Elem[] Heap;
	private int size;
	private int n;
	
	public MaxHeap(Elem[] h, int num, int max) {
		Heap = h;
		n = num;
		size = max;
//		buildHeap();
	}
	public int heapSize() {
		return n;
	}
	public boolean isLeaf(int pos) {
		return (pos >= n/2) && (pos < n);
	}
	public int leftChild(int pos) {
		assert pos < n/2 : "Positon has no left child";
		return 2 * pos + 1;
	}
	public int rightChild(int pos) {
		assert pos < (n-1)/2 : "Position has no right child";
		return 2 * pos + 2;
	}
	public int parent(int pos) {
		assert pos > 0 : "Positon has no parent";
		return (pos - 1)/2;
	}
	
	public void buidHeap() {
		for (int i = n/2 - 1; i >= 0; i--) {
			siftDown(i);
		}
	}
	private void siftDown(int pos) {
		assert pos >= 0 && pos < n : "Illefal heap position";
		while (!isLeaf(pos)) {
			int j = leftChild(pos);
			if ((j < (n-1)) && (Heap[j].key() < Heap[j+1].key())) {
				j++;
			}
			if (Heap[pos].key() >= Heap[j].key()) {
				return;
			}
			// TODO : swap pos and j
			pos = j;
		}
	}
	public void insert(Elem val) {
		assert n < size : "Heap is full";
		int curr = n++;
		Heap[curr] = val;
		
		while ((curr != 0) && (Heap[curr].key() > Heap[parent(curr)].key())) {
			// TODO swap "curr" and "parent[curr]"
			curr = parent(curr);
		}
	}
	public Elem removemax() {
		assert n > 0 : "removing from empty heap";
		// swap "0" and "--n"
		if (n != 0) {
			siftDown(0);
		}
		return Heap[n];
	}
	public Elem remove(int pos) {
		assert pos > 0 && pos < n : "Illegal heap positon";
		// TODO swap "position" and "--n"
		if (n != 0) {
			siftDown(pos);
		}
		return Heap[n];
	}

}
