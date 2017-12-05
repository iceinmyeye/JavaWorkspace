package com.day20170908;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fishing {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#0.00");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			int cx = sc.nextInt();
			int cy = sc.nextInt();
			int time = sc.nextInt();
			double[][] arr = new double[row][col];
			double sum = 0;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					arr[i][j] = sc.nextDouble();
					sum += arr[i][j];
				}
			}
			double p_cc = arr[cx-1][cy-1];
			double p_ss = sum / (row * col);

			double final_cc = 1 - Math.pow(1 - p_cc, time);
			double final_ss = 1 - Math.pow(1 - p_ss, time);
			if (final_cc > final_ss) {
				System.out.println("cc");
				System.out.println(df.format(final_cc));
			} else if (final_cc < final_ss) {
				System.out.println("ss");
				System.out.println(df.format(final_ss));
			} else {
				System.out.println("equal");
				System.out.println(df.format(final_cc));
			}
		}
		sc.close();
	}
}
