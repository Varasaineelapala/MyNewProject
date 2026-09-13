package com.gut;

import java.util.Arrays;

public class SelectionSort {
	static void sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 7, 9, 10, 11, 29 };
		sort(arr);
	}

}
