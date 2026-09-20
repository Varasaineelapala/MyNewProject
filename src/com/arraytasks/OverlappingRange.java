package com.arraytasks;

public class OverlappingRange {
	static void find(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(0);
			} else if (arr[i + 1][0] > arr[i][0] && arr[i + 1][1] < arr[i][1]) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 6 }, { 2, 3 }, { 0, 5 }, { 1, 8 } };
		find(arr);
	}

}
