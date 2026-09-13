package com.Arrays.java;

import java.util.Arrays;

public class ProductExceptItself {

	public static void main(String[] args) {
		int arr[] = { 1,2,3,4};
		int lpro = 1;
		int rpro = 1;
		int result[] = new int[arr.length];
		result [0] = 1;
		for (int i = 1; i < arr.length; i++) {
			lpro *= arr[i - 1];
			result[i] = lpro;
		}
		for (int j = arr.length - 2; j >= 0; j--) {
			rpro *= arr[j + 1];
			result[j] *= rpro;
		}

		System.out.println(Arrays.toString(result));
	}
}