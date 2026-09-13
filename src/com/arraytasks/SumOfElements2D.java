package com.arraytasks;

public class SumOfElements2D {
	static void sum(int[][] arr) {
		int sum = 0;
		for (int[] arr1 : arr) {
			for (int n : arr1) {
				sum += n;
			}
		}
		System.out.println("Sum of the elements : " + sum);
	}

	public static void main(String[] args) {
		int[][] arr = { { 10, 23, 21 }, { 45, 66, 43 }, { 23, 90, 54 } };
		sum(arr);
	}

}
