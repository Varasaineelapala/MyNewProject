package com.arraytasks;

import java.util.Arrays;

public class SpiralArray {
	static void spiral() {
		int n = 4;
		int top = 0;
		int left = 0;
		int right = n - 1;
		int bottom = n - 1;
		int count = 1;
		int[][] arr = new int[n][n];
		while (left < right && top < bottom) {
			for (int i = left; i <= right; i++) {
				arr[top][i] = count++;
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				arr[i][right] = count++;
			}
			right--;
			for (int i = right; i >= left; i--) {
				arr[bottom][i] = count++;
			}
			bottom--;
			for (int i = bottom; i >= top; i--) {
				arr[i][left] = count++;
			}
			left++;
		}
		System.out.println(Arrays.deepToString(arr));
		for (int[] ar : arr) {
			for (int a : ar) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		spiral();
	}

}
