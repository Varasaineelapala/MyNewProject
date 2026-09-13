package com.arraytasks;

public class Zeroes {

	static void zeroes(int[][] arr) {

		boolean[] rows = new boolean[arr.length];
		boolean[] columns = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == 0) {
					rows[i] = true;
					columns[j] = true;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (rows[i] || columns[j]) {
					arr[i][j] = 0;
				}
			}
		}
		for (int[] arr1 : arr) {
			for (int a : arr1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 0 }, { 1, 1, 1 }, { 1, 1, 0 } };
		zeroes(arr);
	}

}

