package com.Arrays.java;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
	static void rotate(int[] arr, int k) {
		int n = arr.length;
		int k1 = k % n;
		for (int i = 0; i < k1; i++) {
			int key = arr[n - 1];
			for (int j = n - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = key;
		}
		System.out.println(Arrays.toString(arr));
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
