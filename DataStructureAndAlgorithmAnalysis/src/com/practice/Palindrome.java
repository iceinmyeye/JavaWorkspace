package com.practice;

import java.util.Scanner;

import com.dataStructure.liststackqueue.AStack;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a string: ");
		String input = sc.nextLine();
		sc.close();
		
		char[] ch = input.toCharArray();
		AStack stack = new AStack(50);
		for (char c : ch) {
			stack.push(c);
		}
		
		boolean boo = true;
		char temp = ' ';
		int i = 0;
		while (!stack.isEmpty()) {
			temp = (char) stack.pop();
			if (temp != ch[i]) {
				boo = false;
				break;
			}
			i++;
		}
		System.out.println(boo);
	}

}
