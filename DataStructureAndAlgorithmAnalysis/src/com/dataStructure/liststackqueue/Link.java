/*
 * a singly linked list node
 */
package com.dataStructure.liststackqueue;

public class Link {
	private Object element;
	private Link next;

	Link(Object it, Link nextval) {
		element = it;
		next = nextval;
	}

	Link(Link nextval) {
		next = nextval;
	}

	Link next() {
		return next;
	}

	Link setNext(Link nextval) {
		return next = nextval;
	}

	Object element() {
		return element;
	}

	Object setElement(Object it) {
		return element = it;
	}
}
