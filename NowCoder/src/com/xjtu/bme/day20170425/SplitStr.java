package com.xjtu.bme.day20170425;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitStr {

	/**
	 * @param args
	 */
	static String[] refractorString(StringBuilder strbd) {
		int a = strbd.length() % 8;
		if (a != 0) {
			for (int i = 0; i < 8 - a; i++) {
				strbd.append('0');
			}
		}
		int b = strbd.length() / 8;
		String[] str = new String[b];
		for (int i = 0; i < b; i++) {
			str[i] = strbd.substring(i * 8, (i + 1) * 8);
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		StringBuilder[] strbld = new StringBuilder[num + 1];
		// String[] string = new String[num];
		List<String[]> list = new ArrayList<String[]>();

		for (int i = 0; i < num + 1; i++) {
			// string[i] = sc.nextLine();
			strbld[i] = new StringBuilder(sc.nextLine());
			String[] str = refractorString(strbld[i]);
			list.add(str);
		}

		for (String[] s : list) {
			for (int j = 0; j < s.length; j++) {
				System.out.println(s[j]);
			}
		}
		sc.close();

	}

}
