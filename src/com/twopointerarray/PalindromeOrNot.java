package com.twopointerarray;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeOrNot {
	static boolean isPalindrome(int[] arr) {
		int left = 0;
		System.out.println((Arrays.toString(arr)));
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] != arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean boo = isPalindrome(arr);
		if (boo) {
			System.out.println("Given array is palindrome...!");
		} else {
			System.out.println("Given array is Not a palindrome...!");
		}
		sc.close();
	}

}
