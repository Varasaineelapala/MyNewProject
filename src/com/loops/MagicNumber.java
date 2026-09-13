package com.loops;

import java.util.Scanner;

public class MagicNumber {

	static void number(int n) {
		if (n < 1) {
			System.out.println("Please enter a positive number...");
			return;
		}
		if (n == 1) {
			System.out.println("Given number is Magic Number");
		} else if (n <= 9 && n > 1) {
			System.out.println("Given number is Not Magic Number");
		} else {
			int n1 = 0;
			while (n > 0) {
				int d = n % 10;
				n1 = n1 + d;
				n /= 10;
			}
			number(n1);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		number(num);
		sc.close();

	}

}
// alternative (n % 9==1)
