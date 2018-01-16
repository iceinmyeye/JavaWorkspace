package com.adt;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Rolls { // 模拟掷筛子

	public static void main(String[] args) {
		
		int T = Integer.parseInt(args[0]);
		int SIDES = 6;
		Counter[] rolls = new Counter[SIDES + 1];
		
		for (int i = 1; i <= SIDES; i++) {
			rolls[i] = new Counter("Side " + i);
		}
		for (int t = 0; t < T; t++) {
			int result = StdRandom.uniform(1, SIDES + 1);
			rolls[result].increment();
		}
		for (int i = 1; i < SIDES + 1; i++) {
			StdOut.println(rolls[i]); // 这儿自行调用了Counter中的toString方法
		}
	}

}
