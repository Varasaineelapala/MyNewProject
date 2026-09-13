package com.loops;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElement {
	static void find(int[] arr, int k) {
		if (k > arr.length || k <= 0 || arr == null) {
			System.out.println("Invlid input...!");
			return;
		}
		int Max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > Max) {
				Max = arr[i];
			}
		}
		for (int i = 0; i < k - 1; i++) {
			int curMax = Integer.MIN_VALUE;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] < Max && arr[j] > curMax) {
					curMax = arr[j];
				}
			}
			Max = curMax;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter k value : ");
		int k = sc.nextInt();
		int[] arr = { -4, -2, -6, -8, 5, -9 };
		find(arr, k);
		sc.close();
	}
}
