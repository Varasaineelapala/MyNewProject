package com.gut;

import java.util.Arrays;

public class MoveNegatives {
	static void move(int[] arr) {
		int i = 0;
		int j = 0;
		int n = arr.length;
		for (i = 0; i < n; i++) {
			if (arr[i] < 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}

		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, -4, 5, -6 };
		System.out.println(Arrays.toString(arr));
		move(arr);
	}

}
