package com.gut;

public class SecondLargestElement {
	static void secondLarge(int[] arr) {
		if (arr == null) {
			System.out.println("enter a valid array..!");
			return;
		}
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] < max) {
				secondMax = arr[i];
			}
		}
		System.out.println(secondMax);
	}

	public static void main(String[] args) {
		int[] arr = { 9, 2, 5, 6, 7, 8, 1 };
		secondLarge(arr);
	}

}
