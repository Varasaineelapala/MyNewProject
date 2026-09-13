package com.loops;

import java.util.Scanner;

public class HappyNumber {

	static boolean isHappyNumber(int n) {
		boolean boo = false;
		while (n > 0) {
			if (n == 1) {
				boo = true;
				break;
			} else if (n == 4) {
				boo = false;
				break;
			}
			int sum = 0;
			while (n > 0) {
				int dig = n % 10;
				sum = sum + SwapDigits.power(dig, 2);
				n /= 10;
			}
			n = sum;
		}
		return boo;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			boolean status = isHappyNumber(i);
			if (status) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
