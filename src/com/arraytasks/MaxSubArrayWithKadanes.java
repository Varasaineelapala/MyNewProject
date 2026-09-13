package com.arraytasks;
public class MaxSubArrayWithKadanes {
	static int findMax(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		for (int n : arr) {
			curSum += n;
			if (curSum > maxSum) {
				maxSum = curSum;
			}
			if (curSum < 0) {
				curSum = 0;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] arr = { 3, -2, 4, -8, 4, -3, -2, 9, -1 };
		int max = findMax(arr);
		System.out.println("Max sum : " + max);
	}
}
