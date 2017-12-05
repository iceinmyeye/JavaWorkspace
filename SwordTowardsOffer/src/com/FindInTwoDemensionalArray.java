package com;

import java.util.Scanner;

public class FindInTwoDemensionalArray {

	static int[][] array;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int columns = sc.nextInt();
		array = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = sc.nextInt();
			}
		}

		int toFind = sc.nextInt();
		
		if (isElementInArray(toFind, array.length - 1, 0)) {
			System.out.println("Element is found");
		} else {
			System.out.println("No element");
		}
		sc.close();
	}

	private static boolean isElementInArray(int element, int row, int col) {

		while (row >= 0 && col <= array[0].length) {
			if (array[row][col] == element)
				return true;

			if (array[row][col] < element)
				col++;

			if (array[row][col] > element)
				row--;
		}
		return false;
	}

}
