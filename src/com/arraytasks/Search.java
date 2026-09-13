package com.arraytasks;

public class Search {
	static void search(int[][] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == n) {
					System.out.println(" i :" + i + "\n j :" + j);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		search(arr, 5);
	}

}
