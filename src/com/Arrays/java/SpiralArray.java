package com.Arrays.java;

import java.util.Arrays;

public class SpiralArray {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr.length - 1;
		int val = 1;
		while (top < bottom && left < right) {
			for (int i = left; i <= right; i++) {
				arr[top][i] = val++;
			}
			top++;
			for (int j = top; j <= bottom; j++) {
				arr[j][right] = val++;
			}
			right--;
			for (int k = right; k >= left; k--) {
				arr[bottom][k] = val++;
			}
			bottom--;
			for (int l = bottom; l >= top; l--) {
				arr[l][left] = val++;
			}
			left++;
		}
		for (int[] arr1 : arr) {
			for (int a : arr1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

	}

}
