package com.patterns;

public class PascalTringle2 {

	public static void main(String[] args) {
		int n = 5;
		int val = 1;
		for (int i = 1; i <= n; i++) {
			val = 1;
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(val + " ");
				val = val * (i - k) / k;
			}
			System.out.println();
		}
	}
}
