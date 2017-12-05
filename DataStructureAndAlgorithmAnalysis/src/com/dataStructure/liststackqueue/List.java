package com.dataStructure.liststackqueue;

public interface List {             // List ADT
	public void clear();            // remove all objects form list
	public void insert(Object item);           // insert object at current position
	public void append(Object item);           // insert object at tail of list
	public Object remove();                    // remove / return current object
	public void setFirst();                    // set current to first position
	public void next();                        // move current to next position
	public void prev();                        // move current to previous position
	public int length();                       // return current length of list
	public void setPos(int pos);               // set current to specified pos
	public void setValue(Object val);          // set current Object's value
	public Object currValue();                 // return value of current Object
	public boolean isEmpty();                  // return true if list is empty
	public boolean isInList();                 // true if current is within list
	public void print();                       // print all of list's elements

}
