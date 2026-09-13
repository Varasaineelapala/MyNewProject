package com.loops;

import java.util.Scanner;

public class PerfectNumber {
	static Scanner sc = new Scanner(System.in);
	String ch;


	void perfect(int num) {
		int sum=0;
		System.out.println("Factors of " + num);
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");

				sum = sum + i;

			}
		}
		System.out.println(num);
		if (num == sum) {
			System.out.println(num + " is a perfect number ");
		} else {
			System.out.println(num + " is not a perfect number ");
		}

		System.out.println("----------------------------------------------");
	}

	public static void main(String[] args) {
		PerfectNumber pn = new PerfectNumber();
		do {
			System.out.print("Enter an interger :");
			int num = sc.nextInt();
			pn.perfect(num);
			System.out.println("Enter \"Y\" if you want to check another number or \"N\" to exit");
			System.out.print("Enter your choice :");
			pn.ch = sc.next();
			System.out.println("----------------------------------------------");
		} while (pn.ch.equalsIgnoreCase("y"));
		System.out.println("EXIT...!");
	}

}
