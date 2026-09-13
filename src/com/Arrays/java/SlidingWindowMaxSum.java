package com.Arrays.java;

public class SlidingWindowMaxSum {
	static void sum(int[] arr, int k) {
		int n = arr.length;
		int sum = 0;
		int s = 0;
		int e = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		int curSum = sum;
		for (int j = 1; j <= n - k; j++) {
			curSum = curSum - arr[j - 1] + arr[j + (k - 1)];
			if (curSum > sum) {
				sum = curSum;
				s = j;
				e = j + k;
			}
		}
		System.out.println(sum);
		System.out.println(s);
		System.out.println(e);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		sum(arr, k);
	}

}
