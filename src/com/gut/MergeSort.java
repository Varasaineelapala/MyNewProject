package com.gut;

import java.util.Arrays;

public class MergeSort {
	static void divide(int[] arr) {
		if (arr.length == 1) {
			return;
		}
		int n = arr.length;
		int[] left = new int[n / 2];
		int[] right = new int[n - left.length];
		int i = 0;
		for (i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = arr[i];
			i++;
		}
		divide(left);
		divide(right);
		merge(arr, left, right);
	}

	static void merge(int[] arr, int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
				k++;
			} else {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}
	}

	public static void main(String[] args) {
		int[] arr = { 8, 5, 6, 4, 3, 2, 9, 1 };
		divide(arr);
		System.out.println(Arrays.toString(arr));
	}

}
