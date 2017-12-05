package com.dataStructure.generalTree;

public interface GenTree {  // general tree ADT
	public void clear();  // clear the tree
	public GTNode root();  // return the root
	
	// make the tree have a new root with children first and sibling
	public void newroot(Object value, GTNode first, GTNode sib);

} // interface GenTree
