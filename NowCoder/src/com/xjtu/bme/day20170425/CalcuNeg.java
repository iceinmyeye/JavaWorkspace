package com.xjtu.bme.day20170425;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcuNeg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1 = 0, count2 = 0;
		double sum = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			num = sc.nextInt();
			if (num < 0) {
				count1++;
			} else {
				sum += num;
				count2++;
			}
		}
		DecimalFormat df = new DecimalFormat("#.0");
		System.out.println(count1);
		System.out.println(df.format((double) sum / count2));
		sc.close();

	}

}
