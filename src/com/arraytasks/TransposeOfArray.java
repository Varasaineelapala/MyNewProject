package com.arraytasks;

public class TransposeOfArray {
	static void transpose(int[][] arr) {
		System.out.println("Original Matrix");
		for (int[] arr1 : arr) {
			for (int a : arr1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		System.out.println("Transposed Matrix");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		transpose(arr);
	}

}
