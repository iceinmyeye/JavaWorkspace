package com.xjtu.bme.day20170705;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			int sum = n * 2 + n * (n - 1) * 3 / 2;
			System.out.println(sum);
		}
		sc.close();

	}

}
