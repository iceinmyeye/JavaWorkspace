package com.dataStructure.graph;

public class Graphm implements Graph {      // Graph: adjacency matrix
	private int[][] matrix;          // the edge matrix
	private int numEdge;             // number of edges
	public int[] Mark;               // the mark of array
	
	public Graphm(int n) {           // Constructor
		Mark = new int[n];
		matrix = new int[n][n];
		numEdge = 0;
	}
	
	public int n() {
		return Mark.length;         // number of vertices
	}
	public int e() {
		return numEdge;
	}
	public Edge first(int v) {
		for (int i = 0; i < Mark.length; i++) {
			if (matrix[v][i] != 0) {
				return new Edgem(v, i);
			}
		}
		return null;
	}
	public Edge next(Edge w) {
		if (w == null) {
			return null;
		}
		for (int i = w.v2() + 1; i < Mark.length; i++) {
			if (matrix[w.v1()][i] != 0) {
				return new Edgem(w.v1(), i);
			}
		}
		return null;
	}
	public boolean isEdge(Edge w) {
		if (w == null) {
			return false;
		} else {
			return matrix[w.v1()][w.v2()] != 0;
		}
	}
	public boolean isEdge(int i, int j) {
		return matrix[i][j] != 0;
	}
	public int v1(Edge w) {
		return w.v1();
	}
	public int v2(Edge w) {
		return w.v2();
	}
	public void setEdge(int i, int j, int wt) {
		assert wt != 0 : "cannot set weight to 0";
		matrix[i][j] = wt;
		numEdge++;
	}
	public void setEdge(Edge w, int weight) {
		if (w != null) {
			setEdge(w, weight);
		}
	}
	public void delEdge(Edge w) {
		if (w != null) {
			if (matrix[w.v1()][w.v2()] != 0) {
				matrix[w.v1()][w.v2()] = 0;
				numEdge--;
			}
		}
	}
	public void delEdge(int i, int j) {
		if (matrix[i][j] != 0) {
			matrix[i][j] = 0;
			numEdge--;
		}
	}
	public int weight(int i, int j) {
		if (matrix[i][j] == 0) {
			return Integer.MAX_VALUE;
		} else {
			return matrix[i][j];
		}
	}
	public int weight(Edge w) {
		assert w != null : "cannot take weight of null";
		if (matrix[w.v1()][w.v2()] == 0) {
			return Integer.MAX_VALUE;
		} else {
			return matrix[w.v1()][w.v2()];
		}
	}
	public void setMark(int v, int val) {
		Mark[v] = val;
	}
	public int getMark(int v) {
		return Mark[v];
	}

}
