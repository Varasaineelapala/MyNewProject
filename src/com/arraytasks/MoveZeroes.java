package com.arraytasks;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
	static void move(int[] arr) {
		int n = arr.length;
		int i = 0;
		for (int j = 0; j < n; j++) {
			if (arr[j] != 0) {
				swap(arr, i, j);
				i++;
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
		System.out.print("Enter the array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		move(arr);
		sc.close();
	}

}
