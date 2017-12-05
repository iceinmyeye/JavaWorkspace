/*
 * array-based queue using loop
 * @author dxj
 * @time 2017/9/29
 */
package com.dataStructure.liststackqueue;

public class AQueue {
	private static final int defaultSize = 10;
	private int size;
	private int front;
	private int rear;
	private Object[] listArray;
	
	// Constructor
	public AQueue() {
		setup(defaultSize);
	}
	public AQueue(int sz) {
		setup(sz);
	}
	
	void setup(int sz) {
		size = sz + 1;
		front = rear = 0;
		listArray = new Object[sz+1];
	}
	
	public void clear(){
		front = rear = 0;
	}
	
	// ��ջ
	public void enqueue(Object it) {
		assert (rear+1) % size != front : "Queue is full";  // �ж϶����Ƿ�����
		rear = (rear + 1) % size;  // ѭ������
		listArray[rear] = it;
	}
	
	// ��ջ
	public Object dequeue() {
		assert !isEmpty() : "Queue is empty";
		front = (front + 1) % size;
		return listArray[front];
	}
	
	// ������ǰ���ֵ
	public Object firstValue() {
		assert !isEmpty() : "Queue is empty";
		return listArray[(front+1) % size];
	}
	
	public boolean isEmpty() {
		return front == rear;
	}

}
