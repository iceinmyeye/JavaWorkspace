package com.xjtu.bme.day20170512;

import java.util.Scanner;

public class CacCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] chInput = input.toCharArray();
		char[] chStore = new char[63]; // 空格加数字加大小写字母共63个
		int[] count = new int[63];

		for (int i = 0; i < chInput.length; i++) {
			if (Character.isLowerCase(chInput[i])) {
				int index = chInput[i] - '0' - 13;
				chStore[index] = chInput[i];
				count[index]++;
			} else if (Character.isUpperCase(chInput[i])) {
				int index = chInput[i] - '0' - 7;
				chStore[index] = chInput[i];
				count[index]++;
			} else if (Character.isDigit(chInput[i])) {
				int index = chInput[i] - '0';
				chStore[index] = chInput[i];
				count[index]++;
			} else if (chInput[i] == ' ') {
				chStore[62] = chInput[i]; // 最后一位存储空格
				count[62]++;
			}
		}

		// 进行排序，按照统计个数由多到少输出,如果统计的个数相同，则按照ASII码由小到大排序输出
		for (int i = 0; i < count.length; i++) {
			for (int j = i + 1; j < count.length; j++) {
				if (count[i] < count[j]
						|| (count[i] == count[j] && chStore[i] > chStore[j])) {
					int tInt = count[i];
					count[i] = count[j];
					count[j] = tInt;
					
					char tChar = chStore[i];
					chStore[i] = chStore[j];
					chStore[j] = tChar;
				}
			}
		}
		
		// 输出
		System.out.println(String.valueOf(chStore));

		sc.close();
	}

}
