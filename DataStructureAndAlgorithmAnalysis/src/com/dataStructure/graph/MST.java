/*
 * 最小支撑树 minimum-cost spanning tree
 */
package com.dataStructure.graph;

public class MST {
	
	private static final int UNVISITED = 0;
	private static final int VISITED = 1;

	// compute a minimal-cost spanning tree
	// 通过搜索相邻矩阵来找下一个最近顶点，数组V[i]存储刚被访问的离定点i最近的顶点，
	// 这样就可以知道处理到顶点i时应加入MST的是哪条边
	static void prim(Graph G, int s, int[] D) {
		int[] V = new int[G.n()];
		for (int i = 0; i < G.n(); i++) {
			D[i] = Integer.MAX_VALUE;
		}
		D[s] = 0;
		for (int i = 0; i < G.n(); i++) {
			int v = minVertex(G, D);
			G.setMark(v, VISITED);
			if (v != s) {
				addEdge2MST(V[v]);
			}
			if (v == Integer.MAX_VALUE) {
				return;
			}
			for (Edge w = G.first(v); G.isEdge(w); w = G.next(w)) {
				if (D[G.v2(w)] > G.weight(w)) {
					D[G.v2(w)] = G.weight(w);
					V[G.v2(w)] = v;
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
	
	static void addEdge2MST(int v) {}
}
