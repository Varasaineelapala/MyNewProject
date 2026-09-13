package com.Arrays.java;

import java.util.Arrays;

public class SumOfKelements {
	static int[] sum(int[] arr, int k) {
		int n = arr.length;
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i + 1; j <= i + k; j++) {
				sum = sum + arr[j % n];
			}
			res[i] = sum;
		}
		return res;
	}

//Sliding window version
	static int[] slidingWindowSum(int[] arr, int k) {
		int n = arr.length;
		int[] res = new int[n];
		int sum = 0;
		for (int i = 1; i <= k; i++) {
			sum += arr[i];
		}
		res[0] = sum;
		for (int j = 1; j < n; j++) {
			sum = sum - arr[j] + arr[(j + k) % n];
			res[j] = sum;
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k = 3;
		int[] res = sum(arr, k);
		int[] res2 = slidingWindowSum(arr, k);
		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(res2));
	}

}
