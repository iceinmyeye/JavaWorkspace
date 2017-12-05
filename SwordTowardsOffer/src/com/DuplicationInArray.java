package com;

import java.util.Scanner;

public class DuplicationInArray {
	
	static int duplication;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] numbers = new int[len];
		for (int i = 0; i < len; i++) {
			numbers[i] = sc.nextInt();
		}
		if (duplicationNumbers(numbers)) {
			System.out.println("The duplication in the array is " + duplication);
		} else {
			System.out.println("None duplication found!");
		}
		sc.close();
	}

	private static boolean duplicationNumbers(int[] numbers) {

		// make sure every element is legal
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0 || numbers[i] > numbers.length - 1)
				return false;
		}
		
		// find out one duplication
		for (int i = 0; i < numbers.length; i++) {
			while (numbers[i] != i) {
				if (numbers[i] == numbers[numbers[i]]) {
					duplication = numbers[i];
					return true;
				}
				// swap
				int temp = numbers[i];
				numbers[i] = numbers[temp];
				numbers[temp] = temp;
			}
		}
		return false;
	}

}
