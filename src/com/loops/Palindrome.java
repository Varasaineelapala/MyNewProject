package com.loops;

import java.util.Scanner;

public class Palindrome {

	boolean isPalindrome(int n) {
		boolean flag = false;
		int org = n;
		int rev = 0;
		int d = 0;
		while (n > 0) {
			d = n % 10;
			rev = rev * 10 + d;
			n /= 10;
		}
		if (org == rev) {
			return flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive interger :");
		int n = sc.nextInt();
		boolean b = p.isPalindrome(n);
		if (b) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
