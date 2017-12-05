package com.inner_sort;

import java.util.Arrays;

public class DifferentSortMethods {

	public static void main(String[] args) {
		int[] test1 = { 2, 6, 1, 89, 56, 20, 5, 34, 76, 15, 16, 49, 40, 34 };
		int[] test2 = { 2, 6, 1, 89, 56, 20, 5, 34, 76, 15, 16, 49, 40, 34 };
		int[] test3 = { 2, 6, 1, 89, 56, 20, 5, 34, 76, 15, 16, 49, 40, 34 };
		
		insertSort(test1);
		System.out.println(Arrays.toString(test1));
		
		bubbleSort(test2);
		System.out.println(Arrays.toString(test2));
		
		selectionSort(test3);
		System.out.println(Arrays.toString(test3));
	}
	
	// ��������
	static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {  //�״Σ���1�Ų��뵽ֻ��0�Ź��ɵ�������
			for (int j = i; j > 0 && arr[j] < arr[j-1]; j--) {  //��j�Ų��뵽0��j-1���ɵ�������
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}
	}
	
	// ð������
	static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	// ѡ������
	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {  //�ҳ���С�������ŵ���ǰ��
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
	}

}
