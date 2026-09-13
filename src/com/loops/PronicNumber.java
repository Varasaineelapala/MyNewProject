package com.loops;

import java.util.Scanner;

public class PronicNumber {
	static boolean isPronic(int n) {
		int c = count(n);
		int p = (int) (Math.pow(10, c));
		for (int i = 1; i < p; i++) {
			if (i * (i + 1) == n) {
				return true;
			}
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
		for(int i=0;i<20;i++) {
			System.out.println(i*(i+1));
		}
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		boolean status = isPronic(num);
		if (status) {
			System.out.println("Is pronic");
		} else {
			System.out.println("Is not Pronic ");
		}
		sc.close();
	}

}
