package com.gut;

public class SortedOrNot {
	static boolean isSorted(int arr[]) {
		boolean flag = true;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 4, 6, 7 };
		boolean status = isSorted(arr);
		if (status) {
			System.out.println("Array is sorted ");
		} else {
			System.out.println("Array is not sorted ");
		}
	}

}
