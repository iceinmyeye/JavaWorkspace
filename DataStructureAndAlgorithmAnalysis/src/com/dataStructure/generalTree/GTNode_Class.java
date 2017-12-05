package com.dataStructure.generalTree;

public class GTNode_Class {  // general tree node for UNION/FIND
	private GTNode_Class par;  // parent pointer
	public GTNode_Class() {  // constructor
		par = null;
	}
	public GTNode_Class parent() {  // return node's parent
		return par;
	}
	public GTNode_Class setParent(GTNode_Class newpar) {  // set the parent pointer
		return par = newpar;
	}

} // class GTNode_Class
