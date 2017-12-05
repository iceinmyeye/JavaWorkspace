package com.dataStructure.graph;

public interface Graph {     // Graph class ADT
	public int n();          // number of vertices
	public int e();          // number of edges
	public Edge first(int v);      // get first edge for vertex
	public Edge next(Edge w);      // get next edge for a vertex
	public boolean isEdge(Edge w); // true if this is an edge
	public boolean isEdge(int i, int j);   // true if this is an edge
	public int v1(Edge w);         // where edge came from
	public int v2(Edge w);         // where edge goes to
	public void setEdge(int i, int j, int weight);   // set edge weight
	public void setEdge(Edge w, int weight);         // set edge weight
	public void delEdge(Edge w);                     // delete edge w
	public void delEdge(int i, int j);               // delete edge(i, j)
	public int weight(int i, int j);                 // return weight of edge
	public int weight(Edge w);                       // return weight of edge
	public void setMark(int v, int val);             // set mark for v
	public int getMark(int v);                      // set mark for v

}