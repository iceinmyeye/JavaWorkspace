package com.day20170908;

import java.util.Scanner;

public class GridPaper {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// 读取输入
			int dotNum = sc.nextInt();
			int[][] dot = new int[2][dotNum];
			int[] xMax = new int[2];
			int[] xMin = new int[2];
			int[] yMax = new int[2];
			int[] yMin = new int[2];
			for (int i = 0; i < dotNum; i++) {
				dot[0][i] = sc.nextInt();
				dot[1][i] = sc.nextInt();
				if (dot[0][i] > xMax[0]) {
					xMax[0] = dot[0][i];
					xMax[1] = dot[1][i];
				}
				if (dot[0][i] < xMin[0]) {
					xMin[0] = dot[0][i];
					xMin[1] = dot[1][i];
				}
				if (dot[1][i] > yMax[1]) {
					yMax[0] = dot[0][i];
					yMax[1] = dot[1][i];
				}
				if (dot[1][i] < yMin[1]) {
					yMin[0] = dot[0][i];
					yMin[1] = dot[1][i];
				}
			}
			
			// 确定左右上下的边界值
			int left = Math.min(xMin[0], Math.min(yMin[0], yMax[0]));
			int right = Math.max(xMax[0], Math.max(yMin[0], yMax[0]));
			int up = Math.min(yMin[1], Math.min(xMin[1], xMax[1]));
			int bottom = Math.max(yMax[1], Math.max(xMin[1], xMax[1]));
			
			int horizontal = right - left;
			int vertical = bottom - up;
			int result = (int) Math.pow(Math.max(horizontal, vertical), 2);
			System.out.println(result);
		}
		sc.close();
	}
}
