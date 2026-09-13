package com.Arrays.java;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
	static void reverse(int[] arr, int left, int right) {
		while (left < right) {
			swap(arr, left, right);
			left++;
			right--;
		}
	}

	static void rotate(int[] arr, int key) {
		int n = arr.length;
		int k = key % n;
		if (k < 0) {
			k = k + arr.length;
		}
		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size if thea array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter key : ");
		int k = sc.nextInt();
		rotate(arr, k);
		sc.close();
	}
}
