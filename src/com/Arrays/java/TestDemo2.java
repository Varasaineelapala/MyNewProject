package com.Arrays.java;

import java.util.Arrays;
import java.util.Scanner;

public class TestDemo2 {
	static void add(int[] arr1, int[] arr2) {
		System.out.print("first array : ");
		System.out.println(Arrays.toString(arr1));
		System.out.print("Second array : ");
		System.out.println(Arrays.toString(arr2));
		int n = Math.max(arr1.length, arr2.length);
		int[] arr3 = new int[n];
		int k = 0;
		int i = 0;

		for (i = 0; i < arr1.length && i < arr2.length; i++) {
			if (arr1[i] < arr2[i]) {
				arr3[i] = arr2[i] - arr1[i];
			} else {
				arr3[i] = arr1[i];
			}
			k++;
		}
		for (; i < arr1.length; i++) {
			arr3[k++] = arr1[i++];
		}
		for (; i < arr1.length; i++) {
			arr3[k++] = arr2[i++];
		}
		System.out.print("Combined array : ");
		System.out.println(Arrays.toString(arr3));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size if the first array : ");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.print("Enter the size if the  second : ");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}
		add(arr1, arr2);
		sc.close();
	}

}
