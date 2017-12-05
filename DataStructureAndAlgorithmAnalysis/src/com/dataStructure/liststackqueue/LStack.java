/*
 * linked stack
 */
package com.dataStructure.liststackqueue;

public class LStack {
	private Link top;

	public LStack() {
		setup();
	}

	public LStack(int sz) {
		setup(); // ����sz
	}

	public void setup() {
		top = null;
	}

	public void clear() {
		top = null;
	}

	// ��ջ
	public void push(Object it) {
		top = new Link(it, top);
	}

	// ��ջ
	public Object pop() {
		assert !isEmpty() : "Empty stack";
		Object it = top.element();
		top = top.next();
		return it;
	}

	// ��ջ��ֵ
	public Object topValue() {
		assert !isEmpty() : "No top value found";
		return top.element();
	}

	public boolean isEmpty() {
		return top == null;
	}

}
