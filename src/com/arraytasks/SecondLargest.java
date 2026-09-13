package com.arraytasks;

import java.util.Scanner;

public class SecondLargest {
	static void second(int[] arr) {
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int n : arr) {
			if (n > max) {
				max = n;
			}
			for (int m : arr) {
				if (m < max && m > max2) {
					max2 = n;
				}
			}
		}
		System.out.println("Largest Element : " + max);
		System.out.println("Second Largest Element " + max2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		second(arr);
	}

}
