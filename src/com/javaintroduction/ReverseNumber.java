package com.javaintroduction;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rev = 0;
		int dig = 0;
		System.out.print("Enter a number to reverse :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num != 0) {
			dig = num % 10;
			rev = rev * 10 + dig;
			num = num / 10;
		}
		System.out.println(rev);
		sc.close();
	}

}
