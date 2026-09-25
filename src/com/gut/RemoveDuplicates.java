package com.gut;

public class RemoveDuplicates {
	static void remove(int[] arr) {
		int n = arr.length;
		int j = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}
		System.out.println("New array length : " + (j + 1));
		for (int i = 0; i < (j + 1); i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4 };
		remove(arr);
	}

}
