/*
 * linked queue
 */
package com.dataStructure.liststackqueue;

class LQueue {
	private Link front;
	private Link rear;
	
	public LQueue() {
		setup();
	}
	public LQueue(int sz) {
		setup();  // ����sz
	}
	
	private void setup() {
		front  = rear = null;
	}
	
	// ɾ������Ԫ��
	public void clear() {
		front = rear = null;
	}
	
	// �����
	public void enqueue(Object it) {
		if (rear != null) {
			rear.setNext(new Link(it, null));
			rear = rear.next();
		} else {
			front = rear = new Link(it, null);  // �ն���
		}
	}
	
	// ������
	public Object dequeue() {
		assert !isEmpty();
		Object it = front.element();
		front = front.next();
		if (front == null) rear = null;
		return it;
	}
	
	public Object firstValue() {
		assert !isEmpty();
		return front.element();
	}
	
	public boolean isEmpty() {
		return front == null;
	}

}
