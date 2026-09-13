package com.loops;

import java.util.Scanner;

public class AutomorphicNumber {
	static boolean isAuto(int n) {
		int c = count(n);
		int p = (int) (Math.pow(10, c));
		int s = n * n;
		if (s % p == n) {
			return true;
		}
		return false;

	}

	static int count(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		boolean status = isAuto(num);
		if (status) {
			System.out.println("Is Automorphic Number ");
		} else {
			System.out.println("Is not an Automorphic Number ");
		}
		sc.close();

	}

}
