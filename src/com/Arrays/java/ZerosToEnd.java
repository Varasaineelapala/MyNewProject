package com.Arrays.java;

public class ZerosToEnd {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int[] arr = { 1, 2, 0, 0, 4, 6, 0, 3, 5, 2, 3, 0, 0, 3, 9, 7, 0, 6, 0, 5, 9 };
		for (i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}

		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}
}
