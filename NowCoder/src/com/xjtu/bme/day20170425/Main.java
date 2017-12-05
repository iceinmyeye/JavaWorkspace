package com.xjtu.bme.day20170425;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	static final double E = 0.0001;

	public static double getCubeRoot(double input) {
		double x0, x1;
		x0 = input;
		x1 = (2*x0)/3 + input/(3*x0*x0);
		while (x0 - x1 > E || x1 - x0 < -E) {
			x0 = x1;
			x1 = (2*x0)/3 + input/(3*x0*x0);
//			if (x0 - x1 < E || x1 - x0 > -E) {
//				break;
//			}
		}
		return x1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		double num = getCubeRoot(sc.nextDouble());
		System.out.println(df.format(num));
		sc.close();
		
		String test = "1小时12分钟";
		String[] str = test.split("小时");
		for (String temp : str) {
			System.out.println(temp);
		}
		System.out.println(str.length);
		System.out.println(test.equals(str[0]));
		System.out.println(test == str[0]);

	}

}
