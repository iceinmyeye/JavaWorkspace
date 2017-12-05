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
		setup();  // 忽略sz
	}
	
	private void setup() {
		front  = rear = null;
	}
	
	// 删除所有元素
	public void clear() {
		front = rear = null;
	}
	
	// 入队列
	public void enqueue(Object it) {
		if (rear != null) {
			rear.setNext(new Link(it, null));
			rear = rear.next();
		} else {
			front = rear = new Link(it, null);  // 空队列
		}
	}
	
	// 出队列
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
