package com.gut;

public class BinarySearch {
	static void search(int[] arr, int left, int right, int target) {
		if ((right - left) < 0) {
			System.out.println("Item not found in the array...!");
			return;
		}
		int mid = (left + right) / 2;
		if (arr[mid] == target) {
			System.out.println(target + " Found at Index : " + mid);
		} else if (arr[mid] < target) {
			search(arr, mid + 1, right, target);
		} else {
			search(arr, left, mid - 1, target);
		}
	}
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int left = 0;
		int right = arr.length - 1;
		int target = 8;
		search(arr, left, right, target);
	}

}
