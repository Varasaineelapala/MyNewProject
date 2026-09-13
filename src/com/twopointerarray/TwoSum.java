package com.twopointerarray;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
	static void twoSum(int[] arr) {
		System.out.println(Arrays.toString(arr));
		boolean flag = false;
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int target = 9;
			int sum = arr[left] + arr[right];
			if (sum == target) {
				flag = true;
				System.out.println("Trget found Successfully...!");
				System.out.println(arr[left] + " + " + arr[right] + " = " + sum);
				left++;
				right--;
			} else if (sum > target) {
				right--;
			} else {
				left++;
			}
		}
		if (!flag) {
			System.out.println("Target Not Found...!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array in ascending order only  : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		sc.close();
		twoSum(arr);
	}

}
