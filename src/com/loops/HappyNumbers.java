package com.loops;

import java.util.Scanner;

public class HappyNumbers {

	static boolean isHappyNumber(int n) {
		boolean boo = false;
		while (n > 0) {
			if (n == 1 ) {
				boo = true;
				break;
			} else if (n == 4 || n<=0 ) {
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
		System.out.print("Enter a number : ");
		int num = sc.nextInt();

		boolean status = isHappyNumber(num);
		if (status) {
			System.out.println(num + " Is Happy Number");
		} else {
			System.out.println(num + " Is Not a Happy Number");
		}
		sc.close();
	}

}
