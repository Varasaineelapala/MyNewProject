package com.arraytasks;

import java.util.Arrays;

public class MergeArrays {
	static void merge(int[] result, int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				result[k] = arr1[i];
				i++;
			} else {
				result[k] = arr2[j];
				j++;
			}
			k++;
		}
		while (i < arr1.length) {
			result[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			result[k++] = arr2[j++];
		}
		System.out.println(Arrays.toString(result));
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8, 9 };
		int[] arr2 = { 1, 3, 5, 7, 10 };
		int n = arr1.length + arr2.length;
		int[] result = new int[n];
		merge(result, arr1, arr2);
	}

}
