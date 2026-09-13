package com.loops;

import java.util.Scanner;

public class AlternativePrimeNumber {

	static boolean prime(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range :");
		int n = sc.nextInt();
		for (int i = 2; i < n; i++) {
			boolean pri = prime(i);
			if (pri) {
				count++;
				if (count % 2 == 0) {
					System.out.print(i + " ");
				}

			}
		}
		sc.close();
	}

}
