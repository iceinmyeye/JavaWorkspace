package com.dataStructure.graph;

import com.dataStructure.liststackqueue.Link;

public class Edgel implements Edge {
	private int vert1, vert2;      // indices of v1. v2
	private Link itself;           // pointer to node in the adjacency list
	
	public Edgel(int vt1, int vt2, Link it) {
		vert1 = vt1;
		vert2 = vt2;
		itself = it;
	}
	
	public int v1() {
		return vert1;
	}
	
	public int v2() {
		return vert2;
	}
	
	Link theLink() {
		return itself;
	}
}
