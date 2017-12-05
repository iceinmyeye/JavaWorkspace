/*
 * array-based stack
 */
package com.dataStructure.liststackqueue;

public class AStack {
	private static final int defaultSize = 10;
	private int size;
	private int top;
	private Object[] listArray;

	public AStack() {
		setup(defaultSize);
	}

	public AStack(int sz) {
		setup(sz);
	}

	public void setup(int sz) {
		size = sz;
		top = 0;
		listArray = new Object[sz];
	}

	// ����
	public void clear() {
		top = 0;
	}

	// ��ջ
	public void push(Object it) {
		assert top < size : "Stack Overflow";
		listArray[top++] = it;
	}

	// ��ջ
	public Object pop() {
		assert !isEmpty() : "Empty Stack";
		return listArray[top-1];
	}

	// ����ջ��Ԫ��
	public Object topValue() {
		assert !isEmpty() : "Empty Stack";
		return listArray[top - 1];
	}

	public boolean isEmpty() {
		return top == 0;
	}
}
