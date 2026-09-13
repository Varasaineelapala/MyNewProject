package com.arraytasks;

import java.util.Scanner;

public class ArraysDemo2 {
	static void rev(int[] nums) {
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
	}

	static void maxMinValues(int[] nums) {
		int max_value = Integer.MIN_VALUE;
		int min_value = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > max_value) {
				max_value = nums[i];
			}
			if (nums[i] < min_value) {
				min_value = nums[i];
			}
		}
		System.out.print("\nMaximum value : " + max_value);
		System.out.print("\nMinimum value : " + min_value);
	}

	static void sumAndAvg(int[] nums) {
		double sum = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			sum = sum + nums[i];
		}
		double avg = sum / nums.length;
		System.out.print("\nSum  : " + sum);
		System.out.print("\nAverage : " + avg);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n=sc.nextInt();
		int[] nums = new int[n];
		for (int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		rev(nums);
		maxMinValues(nums);
		sumAndAvg(nums);
		sc.close();

	}

}
