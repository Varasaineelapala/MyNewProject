package com.Arrays.java;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 10, 11 };
		int target = 16;
		int sum = 0;
		int start = 0;
		int end = arr.length - 1;
		boolean found = false;
		while (start < end) {
			sum = arr[end] + arr[start];
			if (sum == target) {
				System.out.println("target found at index " + start + " and " + end);
				found = true;
				break;
			} else if (sum > target) {
				end--;
			} else {
				start++;
			}
		}
		if (!found) {
			System.out.println("target not found");
		}
	}
}
