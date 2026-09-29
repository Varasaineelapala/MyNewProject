package com.gut;

import java.util.Arrays;

public class QuickSort {
	static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start - 1;
		for (int j = start; j < end; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		} 
		swap(arr, i + 1, end);
		return i + 1;
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	static void quick(int[] arr, int start, int end) {
		if (start < end) {
			int pi = partition(arr, start, end);
			quick(arr, start, pi - 1);
			quick(arr, pi + 1, end);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 7, 3, 2, 1 };
		int n = arr.length - 1;
		quick(arr, 0, n);
		System.out.println(Arrays.toString(arr));

	}

}
