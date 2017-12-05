package com.day20170908;

import java.util.Scanner;

public class CriminalTransfer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt(); // total number of criminals
			int t = sc.nextInt(); // total sins are no more than t
			int c = sc.nextInt(); // criminals to be transfered

			int[] crime = new int[n];
			for (int i = 0; i < n; i++) {
				crime[i] = sc.nextInt();
			}

			// c名罪犯的罪行循环相加，求出满足条件的个数
			int total = 0;
			int choice = 0;
			for (int i = 0; i <= n - c; i++) {
				for (int j = i; j < i + c; j++) {
					total += crime[j];
				}
				if (total <= t) {
					choice++;
				}
				total = 0;
			}
			System.out.println(choice);
		}
		sc.close();
	}
}
