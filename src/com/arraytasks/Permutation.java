package com.arraytasks;

public class Permutation {
	static void per(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (i == j || j == k || i == k) {
						continue;
					} else {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		per(arr);
	}

}
