package com.loops;

import java.util.Scanner;

public class SwapDigits {
	static int swap(int n) {
		int c = count(n);
		int p = (power(10, c - 1));
		int f = n / p;
		int l = n % 10;
		int mid = n%p -l;
//		int diff = (f > l) ? f - l : l - f;
//		n = (f > l) ? n - diff * (power(10, c - 1)) + diff : n + diff * (power(10, c - 1)) - diff;
		n=(l*p)+mid+f;
		return n;
	}

	static int count(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	static int power(int a, int b) {
		if (a == 0) {
			return 0;
		}
		int pow = 1;
		for (int i = 1; i <= b; i++) {
			pow = pow * a;
		}
		return pow;
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number to swap first and last digits : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int swappedNumber = SwapDigits.swap(num);
		System.out.println(swappedNumber);
		int a = power(0, 0);
		System.out.println(a);
		sc.close();

	}

}
