package com.xjtu.bme.day20170705;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(CalcAutomorphicNumbers(n));
		}
		sc.close();
	}

	public static int CalcAutomorphicNumbers(int n) {
		int i = 0, count = 1;

		for (int k = 0; k < n; k++) {
			int m = k;
			while (m / 10 != 0) {
				m /= 10;
				count++;
			}
			if ((k * k - k) % ((int) Math.pow(10, count)) == 0) {
				i++;
			}
			count = 1;
		}
		return i;
	}

}
