package com;

import java.util.ArrayList;
import java.util.List;

public class CutFruit {

	public static void main(String[] args) {
		int rows = 2;
		int columns = 2;
		// int numOfFriends = 3;
		List<Integer[]> choiceList = new ArrayList<Integer[]>(2); // ArrayList默认初始容量为10，代码中分配容量为2，大于该值时容量会自动增加
		Integer[] choice1 = { 1, 2, 3 };
		choiceList.add(choice1);
		Integer[] choice2 = { 2 };
		choiceList.add(choice2);
		Integer[] choice3 = { 1 };
		choiceList.add(choice3);

		int result = makeFriendHappyMost(rows, columns, choiceList);
		System.out.println("The biggest number of happy friends is " + result);
	}

	private static int makeFriendHappyMost(int rows, int columns, List<Integer[]> choiceList) {
		int size = choiceList.size();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (choiceList.get(j).length > choiceList.get(j + 1).length) {
					Integer[] temp = choiceList.get(j);
					choiceList.remove(j);
					choiceList.add(j + 1, temp);
				}
			}
		}
		List<Integer> storeList = new ArrayList<Integer>();
		int happyNum = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < choiceList.get(i).length; j++) {
				if (storeList.contains(choiceList.get(i)[j]))
					continue;
				happyNum++;
				storeList.add(choiceList.get(i)[j]);
			}
		}
		return happyNum;
	}

}
