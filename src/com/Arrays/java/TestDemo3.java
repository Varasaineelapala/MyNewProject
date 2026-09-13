package com.Arrays.java;

import java.util.Arrays;

public class TestDemo3 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int s = arr.length - 1;
		int[] arr2 = new int[arr.length];
		for (int n : arr) {
			arr2[s--] = n;
		}
		System.out.println(Arrays.toString(arr2));
	}

}
