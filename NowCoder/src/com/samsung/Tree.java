package com.samsung;

import java.util.Scanner;

public class Tree {
	
	public static void main(String[] args) {
		
		// 读取输入
		Scanner sc = new Scanner(System.in);
		
		String in = sc.nextLine();
		int num = sc.nextInt();
		
		// 输入的字符串转换为字符数组
		char[] ch = in.toCharArray();
		
		// 循环判断，输出最终结果
		int temp = 0;
		int sum = 0; // 统计最后输出的数字之和
		for (int i = 0; i < ch.length; i++) {
			switch (ch[i]){
			case '(':
				temp++;
				if (temp == num) {
					sum += char2Int(ch[i+1]);
				}
				break;
			case ')':
				temp--;
				break;
			}
		}
		sc.close();
		System.out.println("The final result is " + sum);
	}
	
	// 将对应的字符转换为数字的函数
	static int char2Int(char ch) {
		switch (ch) {
		case '0':
			return 0;
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		}
		return 0;
	}
}
