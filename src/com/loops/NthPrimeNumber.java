package com.loops;

import java.util.Scanner;

public class NthPrimeNumber {
	static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Enter the range : ");
		int n = sc.nextInt();
		System.out.print("Enter the target : ");
		int target = sc.nextInt();
		for (int i = 2; i < n; i++) {
			boolean status = isPrime(i);
			if (status) {
				count++;
				if (count == target) {
					System.out.print(i + " ");
				}
			}
		}
		sc.close();
	}

}
