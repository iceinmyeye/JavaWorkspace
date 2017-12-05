package com.xjtu.bme.day20170425;

import java.util.Scanner;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("inputString : ");
		String input = sc.nextLine();
		char[] ch1 = input.toCharArray();
		char[] ch2 = new char[input.length()];
		StringBuilder strBld = new StringBuilder();
		int j = 0;
		for (int i = input.length()-1; i >= 0; i--) {
			ch2[j] = ch1[i];
			strBld.append(ch1[i]);
			j++;
		}
		String output = String.valueOf(ch2);
		System.out.println(output);
		System.out.println(strBld);
		sc.close();

	}

}
