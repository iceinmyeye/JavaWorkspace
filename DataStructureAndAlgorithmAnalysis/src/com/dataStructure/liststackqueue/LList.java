package com.dataStructure.liststackqueue;

public class LList implements List {                            // linked list class
	private Link head;                          // pointer to list header
	private Link tail;                          // pointer to last Object in list
	protected Link curr;                        // pointer to current Object
	
	public LList(int sz) {
		setup();
	}
	
	public LList() {
		setup();
	}
	
	private void setup() {                      // do initialization
		tail = head = curr = new Link(null);
	}
	
	public void clear() {
		head.setNext(null);
		curr = tail = head;
	}
	
	public void insert(Object it) {
		assert curr != null : "no current element";
		curr.setNext(new Link(it, curr.next()));
		if (tail == curr) {
			tail = curr.next();
		}
	}
	
	public void append(Object it) {
		tail.setNext(new Link(it, null));
		tail = tail.next();
	}
	
	public Object remove() {
		if (!isInList()) {
			return null;
		}
		Object it = curr.next().element();
		if (tail == curr.next()) {
			tail = curr;
		}
		curr.setNext(curr.next().next());
		return it;
	}
	
	public void setFirst() {
		curr = head;
	}
	
	public void next() {
		if (curr != null) {
			curr = curr.next();
		}
	}
	
	public void prev() {
		if (curr == null || curr == head) {
			curr = null;
			return;
		}
		Link temp = head;
		while (temp != null && temp.next() != curr) {
			temp = temp.next();
		}
		curr = temp;
	}
	
	public int length() {
		int cnt = 0;
		for (Link temp = head.next(); temp != null; temp = temp.next()) {
			cnt++;
		}
		return cnt;
	}
	
	public void setPos(int pos) {
		curr = head;
		for (int i = 0; (curr != null) && (i < pos); i++) {
			curr = curr.next();
		}
	}
	
	public void setValue(Object it) {
		assert isInList();
		curr.setElement(it);
	}
	
	public Object currValue() {
		if (!isInList()) {
			return null;
		}
		return curr.next().element();
	}
	
	public boolean isEmpty() {
		return head.next() == null;
	}
	
	public boolean isInList() {
		return (curr != null) && (curr.next() != null);
	}
	
	public void print() {
		if (isEmpty()) {
			System.out.println("()");
		} else {
			System.out.println("(");
			for (setFirst(); isInList(); next()) {
				System.out.println(currValue() + " ");
			}
			System.out.println(")");
		}
	}

} // class LList
