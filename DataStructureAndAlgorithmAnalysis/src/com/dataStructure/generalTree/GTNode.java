package com.dataStructure.generalTree;

public interface GTNode {  // general tree node ADT
	public Object value();  // return the value
	public boolean isLeaf();  // true if this node is leaf
	public GTNode parent();  // return the parent
	public GTNode leftmost_child();  // return the leftmost child
	public GTNode right_sibling();  // return the right sibling
	public void setValue();  // set the value
	public void setParent();  // set the parent
	public void insert_first(GTNode n);  // add a new leftmost child
	public void insert_next(GTNode n);  // insert a new right sibling
	public void remove_first();  // remove the leftmost child
	public void remove_next();  // remove the right child

} // interface GTNode
