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

	// 清零
	public void clear() {
		top = 0;
	}

	// 入栈
	public void push(Object it) {
		assert top < size : "Stack Overflow";
		listArray[top++] = it;
	}

	// 出栈
	public Object pop() {
		assert !isEmpty() : "Empty Stack";
		return listArray[top-1];
	}

	// 返回栈顶元素
	public Object topValue() {
		assert !isEmpty() : "Empty Stack";
		return listArray[top - 1];
	}

	public boolean isEmpty() {
		return top == 0;
	}
}
