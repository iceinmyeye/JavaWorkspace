package com.dataStructure.graph;

public class Edgem implements Edge {
	private int vert1, vert2; // the vertex indices
	
	public Edgem(int vt1, int vt2) {
		vert1 = vt1;
		vert2 = vt2;
	}
	public int v1() {
		return vert1;
	}
	public int v2() {
		return vert2;
	}

}
