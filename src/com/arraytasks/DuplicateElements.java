package com.arraytasks;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElements {
	static void duplicates(int[] arr) {
		int n = arr.length;
		System.out.println("Given array " + Arrays.toString(arr));
		System.out.print("Repeated elements are : ");
		for (int i = 0; i < n - 1; i++) {
			for (int j = 1 + i; j < n; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		duplicates(arr);
	}

} 
