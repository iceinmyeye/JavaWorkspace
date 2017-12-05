package com.dataStructure.graph;

public class SingleSourceShortestPath {

	private static final int UNVISITED = 0;
	private static final int VISITED = 1;

	// compute shortest path distances from s, store them in D
	static void Dijkstra(Graph G, int s, int[] D) {
		for (int i = 0; i < G.n(); i++) {
			D[i] = Integer.MAX_VALUE;
		}
		D[s] = 0;
		for (int i = 0; i < G.n(); i++) {
			int v = minVertex(G, D);
			G.setMark(v, VISITED);
			if (D[v] == Integer.MAX_VALUE)
				return;
			for (Edge w = G.first(v); G.isEdge(w); w = G.next(w)) {
				if (D[G.v2(w)] > (D[v] + G.weight(w))) {
					D[G.v2(w)] = D[v] + G.weight(w);
				}
			}
		}
	}

	static int minVertex(Graph G, int[] D) {
		int v = 0;
		for (int i = 0; i < G.n(); i++) {
			if (G.getMark(i) == UNVISITED) {
				v = i;
				break;
			}
		}
		for (int i = 0; i < G.n(); i++) {
			if ((G.getMark(i) == UNVISITED) && (D[i] < D[v])) {
				v = i;
			}
		}
		return v;
	}

}
