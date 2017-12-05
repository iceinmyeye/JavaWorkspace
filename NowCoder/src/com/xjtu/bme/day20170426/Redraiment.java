package com.xjtu.bme.day20170426;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Redraiment {

	/**
	 * @param args
	 */
	int getResult(int num, int[] pInput, List<Integer>  pResult) {
		int[] count = new int[num];
		Arrays.fill(count, 1);
		
		int m = 0;
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i; j++) {
				/**
				 * 最右边的数pInput[i]为最大值，左边的数只要小于它就能形成新的序列
				 */
				if (pInput[j] < pInput[i]) {
					count[i] = Math.max(count[i], count[j]+1);
				}
			}
			m = Math.max(m, count[i]);
		}
		
		if (pResult.add(m)) {
			return 1;
		} else {
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] pInput = new int[num];
		
		for (int i = 0; i < num; i++) {
			pInput[i] = sc.nextInt();
		}
		
		List<Integer> pResult = new ArrayList<Integer>();
		
		Redraiment re = new Redraiment();
		if (re.getResult(num, pInput, pResult) == 1) {
			System.out.println(pResult.get(0));
		} else {
			sc.close();
			return;
		}
		sc.close();
	}

}
