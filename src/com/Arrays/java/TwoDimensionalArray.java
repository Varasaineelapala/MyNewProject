package com.Arrays.java;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows number ");
		int r = sc.nextInt();
		int[][] arr = new int[r][];

		for (int i = 0; i < r; i++) {
			System.out.println("Enter columns number ");
			int c = sc.nextInt();
			arr[i] = new int[c];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter the array elements : ");
				arr[i][j] = sc.nextInt();
			}
		}

		for (int[] ar : arr) {
			for (int a : ar) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
