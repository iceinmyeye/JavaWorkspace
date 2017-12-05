package com.xjtu.bme.day20170425;

import java.util.Scanner;
public class CommonMutiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ta = Math.max(a, b);
		int tb = Math.min(a, b);
		int tc = 0;
		int temp = 0, divisor = 0;
		while (true) {
			temp = ta % tb;
			if (temp == 0) {
				divisor = tb;
				break;
			}else {
				tc = tb;
				tb = temp;
				ta = tc;
			}
		}
		System.out.println(a * b / divisor);
		sc.close();

	}

}
