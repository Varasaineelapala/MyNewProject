package com.Arrays.java;

public class RotateMatrix90 {
	static void rotate(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length-1; j >= 0; j--) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(arr);

	}

}
