package com.arraytasks;

public class PrintArrayInSpiral {
	static void printInSpriral(int[][] arr) {
		int n = arr.length;
		int top = 0;
		int bottom = n - 1;
		int left = 0;
		int right = n - 1;
		while (left < right && top < bottom) {
			for (int i = left; i <= right; i++) {

				System.out.print(arr[top][i] + " ");
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				System.out.print(arr[i][right] + " ");
			}
			right--;
			for (int i = right; i >= left; i--) {
				System.out.print(arr[bottom][i] + " ");
			}
			bottom--;
			for (int i = bottom; i >= top; i--) {
				System.out.print(arr[i][left] + " ");
			}
			left++;
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int[] ar : arr) {
			for (int a : ar) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		printInSpriral(arr);
	}

}
