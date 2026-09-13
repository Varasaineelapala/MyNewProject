package com.arraytasks;

public class MaxSubArray {
	static void findSub(int[] arr) {
		int n = arr.length;
		int maxSum = Integer.MIN_VALUE;
		int start = 0;
		int end = 0;

		for (int i = 0; i < n; i++) {
			int j = 0;
			int k = j + i;
			while (k < n) {
				int sum = sum(arr, j, k);
				if (sum > maxSum) {
					maxSum = sum;
					start = j;
					end = k;
				}
				j++;
				k++;
			}
		}
		System.out.println("Max subarray sum : " + maxSum);
		System.out.println("starting index :" + start);
		System.out.println("ending index : " + end);
	}

	static int sum(int[] arr, int i, int j) {
		int sum = 0;
		while (i <= j) {
			sum = sum + arr[i];
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { -1, -2, -3, -6, -3, -6, -7, -8, -1, -1, -2, -4 };
		findSub(arr);

	}

}
