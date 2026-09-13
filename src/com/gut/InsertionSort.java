package com.gut;

import java.util.Arrays;

public class InsertionSort {
	static void sort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int key = arr[i];
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 7, 2, 3, 1 };
		sort(arr);
	}

}
