package com.huawei;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] array = str.split("\\D");
		int temp = 0;
		String out = null;
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() >= temp) {
				temp = array[i].length();
				out = array[i];
			}
		}
		if (out == null) {
			System.out.println("");
		} else {
			System.out.println(out);
		}
		sc.close();
	}
}
