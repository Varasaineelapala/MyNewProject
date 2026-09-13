package com.loops;

import java.util.Scanner;

public class FactotialWithRecursion {

	static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		int fact = fact(n);
		System.out.print("factorial of the given number : ");
		System.out.println(fact);
		sc.close();
	}
}
