package com.Arrays.java;

public class PalindromeArr {

	public static void main(String[] args) {
		boolean pal = true;
		int start = 0;
		int[] arr = { 1, 2, 3, 4, 4, 2, 1 };
		int end = arr.length - 1;
		while (start < end) {
			if (arr[start] != arr[end]) {
				pal = false;
				break;
			} else {
				start++;
				end--;
			}
		}
		if (pal) {
			System.out.println("is palindrome");
			} else {
			System.out.println("not a palindrome");
		}
	}
}
