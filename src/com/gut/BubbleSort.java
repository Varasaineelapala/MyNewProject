package com.gut;

import java.util.Scanner;

public class BubbleSort {
	static void bubble(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					flag = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (flag) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int s = sc.nextInt();
		int[] arr = new int[s];
		System.out.println("Enter array elements ");
		for (int i = 0; i < s; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sorting ");
		for (int n : arr) {
			System.out.print(n + " ");
		}
		bubble(arr);
		System.out.println("\nArray after sorting ");
		for (int n : arr) {
			System.out.print(n + " ");
		}

	}

}
