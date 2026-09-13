package com.sorts;

import java.util.Arrays;

public class MS {
	static void divide(int[] arr) {
		if (arr.length == 1) {
			return;
		}
		int[] L = new int[arr.length / 2];
		int[] R = new int[arr.length - L.length];
		int i = 0;
		for (i = 0; i < L.length; i++) {
			L[i] = arr[i];
		}
		for (int j = 0; j < R.length; j++) {
			R[j] = arr[i];
			i++;
		}
		divide(L);
		divide(R);
		merge(arr, L, R);
	}

	static void merge(int arr[], int L[], int R[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < L.length && j < R.length) {
			if (L[i] <= R[j]) {
				arr[k++] = L[i++];

			} else {
				arr[k++] = R[j++];

			}
		}
		while (i < L.length) {
			arr[k++] = L[i++];
		}
		while (j < R.length) {
			arr[k++] = R[j++];
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1, 4, 7, 2, 6, 8 };
		System.out.println(Arrays.toString(arr));
		divide(arr);
		System.out.println(Arrays.toString(arr));

	}

}
