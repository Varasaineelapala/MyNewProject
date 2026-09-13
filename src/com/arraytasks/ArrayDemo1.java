package com.arraytasks;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int max_value = Integer.MIN_VALUE;
		int min_value = Integer.MAX_VALUE;
		System.out.print("Enter the size of an array : ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the a number : ");

			nums[i] = sc.nextInt();
			if (nums[i] > max_value) {
				max_value = nums[i];
			}
			if (nums[i] < min_value) {
				min_value = nums[i];
			}
			sum = sum + nums[i];
		}
		double avg = (double) sum / n;
		System.out.println("Reverse array : ");
		for (int j = n - 1; j >= 0; j--) {
			System.out.print(nums[j] + " ");
		}
		System.out.println("\nMaximum value : " + max_value);
		System.out.println("Minimum value : " + min_value);
		System.out.println("Total : " + sum);
		System.out.println("Average value : " + avg);
		sc.close();
	}

}
