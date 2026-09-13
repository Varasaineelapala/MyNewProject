package com.Arrays.java;

public class RainWater {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 0, 6, 0, 1, 2, 3 };
		int water = 0;
		int leftmax = arr[0];
		int rightmax = arr[arr.length - 1];
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {

			if (arr[i] <= arr[j]) {
				if (arr[i] < leftmax) {
					water = water + leftmax - arr[i];
				} else {
					leftmax = arr[i];
				}
				i++;
			} else {
				if (arr[j] < rightmax) {
					water = water + rightmax - arr[j];
				} else {
					rightmax = arr[j];
				}
				j--;
			}
		}
		System.out.println(water);

	}

}
