package com.arraytasks;

import java.util.Arrays;

public class SumOfNeighbours {
	static void sum(int[] arr) {
		int n = arr.length;
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				arr2[i] = arr[i] + arr[i + 1];
			} else if (i == n - 1) {
				arr2[i] = arr[i] + arr[i - 1];
			} else {
				arr2[i] = arr[i + 1] + arr[i - 1];
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		System.out.println(Arrays.toString(arr));
		sum(arr);

	}

}
