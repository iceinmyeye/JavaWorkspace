package com.dataStructure.graph;

public class Graphl implements Graph {
	private GraphList[] vertex;
	private int numEdge;
	public int[] Mark;
	
	public Graphl(int n) {
		Mark = new int[n];
		vertex = new GraphList[n];
		for (int i = 0; i < n; i++) {
			vertex[i] = new GraphList();
		}
		numEdge = 0;
	}
	
	public int n() {
		return Mark.length;
	}
	
	public int e() {
		return numEdge;
	}
	
	public Edge first(int v) {
		vertex[v].setFirst();
		if (vertex[v].currValue() == null) {
			return null;
		}
		return new Edgel(v, ((int[]) vertex[v].currValue())[0], vertex[v].currLink());
	}
	
	public boolean isEdge(Edge e) {
		if (e == null) {
			return false;
		}
		vertex[e.v1()].setCurr(((Edgel)e).theLink());
		if (!vertex[e.v1()].isInList()) {
			return false;
		}
		return ((int[]) vertex[e.v1()].currValue())[0] == e.v2();
	}
	
	public int v1(Edge e) {
		return e.v1();
	}
	
	public int v2(Edge e) {
		return e.v2();
	}
	
	public boolean isEdge(int i, int j) {
		GraphList temp = vertex[i];
		for (temp.setFirst();(temp.currValue() != null) && 
				((int[]) temp.currValue())[0] < j; temp.next()) {
		}
		return (temp.currValue() != null) && 
				(((int[]) temp.currValue())[0] == j);
	}
	
	public Edge next(Edge e) {
		vertex[e.v1()].setCurr(((Edgel)e).theLink());
		vertex[e.v1()].next();
		if (vertex[e.v1()].currValue() == null) {
			return null;
		}
		return new Edgel(e.v1(), ((int[])vertex[e.v1()].currValue())[0], 
				vertex[e.v1()].currLink());
	}
	
	public void setEdge(int i, int j, int weight) {
		assert weight != 0 : "cannot set weight to 0";
		int[] currEdge = {j, weight};
		if (isEdge(i, j)) {
			vertex[i].setValue(currEdge);
		} else {
			vertex[i].insert(currEdge);
			numEdge++;
		}
	}
	
	public void setEdge(Edge w, int weight) {
		if (w != null) {
			setEdge(w.v1(), w.v2(), weight);
		}
	}
	
	public void delEdge(int i, int j) {
		if (isEdge(i, j)) {
			vertex[i].remove();
			numEdge--;
		}
	}
	
	public void delEdge(Edge w) {
		if (w != null) {
			delEdge(w.v1(), w.v2());
		}
	}
	
	public int weight(int i, int j) {
		if (isEdge(i, j)) {
			return ((int[]) vertex[i].currValue())[1];
		} else {
			return Integer.MAX_VALUE;
		}
	}
	
	public int weight(Edge e) {
		if (isEdge(e)) {
			return ((int[]) vertex[e.v1()].currValue())[1];
		} else {
			return Integer.MAX_VALUE;
		}
	}
	
	public void setMark(int v, int val) {
		Mark[v] = val;
	}
	
	public int getMark(int v) {
		return Mark[v];
	}

}
