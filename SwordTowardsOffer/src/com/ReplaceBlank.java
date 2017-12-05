package com;

import java.util.Scanner;

public class ReplaceBlank {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] str = input.split(" ");
		StringBuilder strbd = new StringBuilder();
		for (String s : str) {
			strbd.append(s).append("%20");
		}
		String result = strbd.substring(0, strbd.length() - 3);
		System.out.println(result);
		
		sc.close();
	}
}
