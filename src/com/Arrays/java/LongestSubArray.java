package com.Arrays.java;

public class LongestSubArray {
	static void length(int[] arr, int k) {
		int n = arr.length;
		int left = 0, sum = 0;
		int curLength = 0;
		int maxLength = 0;

		for (int right = 0; right < n; right++) {
			sum += arr[right];

			while (sum > k && left <= right) {
				sum -= arr[left];
				left++;
			}

			if (sum <= k) {
				curLength = right - left + 1;
				if (curLength > maxLength) {
					maxLength = curLength;
				}
			}
		}
		System.out.println(maxLength);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 5, 7, 6, 8, 9, 2, 3, 4, 5, 2, 6, 7, 8, 3 };
		length(arr, 7);
	}

}
