package com.gut;

import java.util.Arrays;

public class MaxMinForm {
	static void arrange(int[] arr) {
		int i = 0;
		int left = 0;
		int right = arr.length - 1;
		int[] arr2 = new int[arr.length];
		while (left < right) {
			arr2[i++] = arr[right];
			arr2[i++] = arr[left];
			left++;
			right--;
			if (left == right) {
				arr2[i] = arr[left];
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		arrange(arr);
	}
}
