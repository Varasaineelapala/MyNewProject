package com.arraytasks;

import java.util.Arrays;

public class ReversingEachElement {
	static void change(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rev(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}

	static int rev(int num) {
		int rev = 0;
		int dig = 0;
		while (num > 0) {
			dig = num % 10;
			rev = rev * 10 + dig;
			num /= 10;
		}
		return rev;
	}

	public static void main(String arr[]) {
		int[] arr1 = { 11, 12, 13, 14, 15, 16 };
		System.out.print("Original array : ");
		System.out.println(Arrays.toString(arr1));
		System.out.print("After reversing : ");
		change(arr1);
	}
}
