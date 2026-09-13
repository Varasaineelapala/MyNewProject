package com.loops;

import java.util.Scanner;

public class StrongNumber {
	boolean strong(int n) {

		int org = n;
		int sum = 0;
		while (n > 0) {
			int fact = 1;
			int d = n % 10;
			while (d > 0) {
				fact = fact * d;
				d--;
			}
			sum = sum + fact;
			n /= 10;
		}
		return sum == org;
	}

	public static void main(String[] args) {
		StrongNumber sn = new StrongNumber();
		System.out.print("Enter a Positive Integer : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean b = sn.strong(n);
		if (b) {
			System.out.println(n + " Is a Strong Number ");
		} else {
			System.out.println(n + " Is Not a Strong Number ");
		}
		sc.close();
	}

}
