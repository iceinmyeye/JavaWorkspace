package com.dataStructure.graph;

import com.dataStructure.liststackqueue.AQueue;

public class TopologicalSort {

	private static final int UNVISITED = 0;
	private static final int VISITED = 1;

	// 第一种方法：递归实现拓扑排序
	static void topSortRecursive(Graph G) {
		for (int i = 0; i < G.n(); i++) { // initialize mark array
			G.setMark(i, UNVISITED);
		}
		for (int i = 0; i < G.n(); i++) {
			if (G.getMark(i) == UNVISITED) {
				tophelp(G, i);
			}
		}
	}

	static void tophelp(Graph G, int v) {
		G.setMark(v, VISITED);
		for (Edge w = G.first(v); G.isEdge(w); w = G.next(w)) {
			if (G.getMark(v) == UNVISITED) {
				tophelp(G, G.v2(w));
			}
		}
		System.out.println(v);
	}

	// 第二种方法：使用队列代替递归实现拓扑结构
	static void topSortQueue(Graph G) {
		AQueue Q = new AQueue(G.n());
		int[] Count = new int[G.n()];
		int v;
		for (v = 0; v < G.n(); v++) { // initialize
			Count[v] = 0;
		}
		for (v = 0; v < G.n(); v++) {
			for (Edge w = G.first(v); G.isEdge(w); w = G.next(w)) {
				Count[G.v2(w)]++;
			}
		}
		for (v = 0; v < G.n(); v++) {
			if (Count[v] == 0) {
				Q.enqueue(new Integer(v));
			}
		}
		while (!Q.isEmpty()) {
			v = ((Integer) Q.dequeue()).intValue();
			System.out.println(v);
			for (Edge w = G.first(v); G.isEdge(w); w = G.next(w)) {
				Count[G.v2(w)]--;
				if (Count[G.v2(w)] == 0) {
					Q.enqueue(new Integer(G.v2(w)));
				}
			}
		}
	}

}
