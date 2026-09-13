package com.twopointerarray;

import java.util.Arrays;
import java.util.Scanner;

public class SortColor {
	static void sort(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		while (mid <= high) {
			if (arr[mid] == 0) {
				swap(arr, mid, low);
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
				swap(arr, mid, high);
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		sort(arr);
		sc.close();
	}

}
