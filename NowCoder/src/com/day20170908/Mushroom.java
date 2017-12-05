package com.day20170908;

import java.text.DecimalFormat;
//import java.util.Arrays;
import java.util.Scanner;

public class Mushroom {

	static int[][] arr;
	static int row;
	static int col;
	static double result;

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#0.00");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			row = sc.nextInt();
			col = sc.nextInt();
			arr = new int[row][col];

			int size = sc.nextInt();
			for (int i = 0; i < size; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				arr[a - 1][b - 1] = 1;
			}
			// for (int i = 0; i < col; i++) {
			// System.out.println(Arrays.toString(arr[i]));
			// }
			dfs(0, 0, 1.0);
			if (result > 1.0) {
				System.out.println(df.format(1.00));
			} else {
				System.out.println(df.format(result));
			}
		}
		sc.close();
	}

	static void dfs(int m, int n, double prob) {
		if (m == row - 1 && n == col - 1) {
			result += prob;
			return;
		}
		if (arr[m][n] == 1) {
			return;
		}
		if (m + 1 < row && n + 1 < col && arr[m + 1][n] == 0) {
			dfs(m + 1, n, prob * 0.5);
		}
		if (m + 1 < row && n + 1 < col && arr[m][n + 1] == 0) {
			dfs(m, n + 1, prob * 0.5);
		}
		if (m == row - 1 && n + 1 < col && arr[m][n + 1] == 0) {
			dfs(m, n + 1, prob);
		}
		if (n == col - 1 && m + 1 < row && arr[m + 1][n] == 0) {
			dfs(m + 1, n, prob);
		}
	}

}
