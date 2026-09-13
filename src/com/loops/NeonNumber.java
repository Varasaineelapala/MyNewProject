package com.loops;

import java.util.Scanner;

public class NeonNumber {
	static boolean isNeonNumber(int n) {
		boolean boo = false;
		int sq = n * n;
		int sum = 0; 
		while (sq > 0) {
			int dig = sq % 10;
			sum = sum + dig;
			sq /= 10;
		}
		if (n == sum) {
			boo = true;
		}
		return boo;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		boolean status = isNeonNumber(num);
		if (status) {
			System.out.println("Is Neon Number ");
		} else {
			System.out.println("Is not a Neon Number");
		}
		sc.close();
	}

}
