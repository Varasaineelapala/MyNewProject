package com.arraytasks;

public class MinAndMax2D {
	static void minMax(int[][] arr) {
		int min = arr[0][0];
		int max = arr[0][0];
		for (int[] arr1 : arr) {
			for (int n : arr1) {
				if (n < min) {
					min = n;
				}else
				if (n > max) {
					max = n;
				}
			}
		}
		System.out.println("Smallest Element : " + min);
		System.out.println("Largest Element : " + max);
	}

	public static void main(String[] args) {
		int[][] arr = { { 99, 23, 21 }, { 45, 66, 5 }, { 23, 90, 54 } };
		minMax(arr);
	}
}
