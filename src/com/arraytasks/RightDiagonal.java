package com.arraytasks;

public class RightDiagonal {
	static void sum(int[][] arr) {
		int sum = 0;
		int i = 0;
		int j = arr.length - 1;
		while (j >= 0) {
			sum = sum + arr[i][j];
			i++;
			j--;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		sum(arr);
	}

}
