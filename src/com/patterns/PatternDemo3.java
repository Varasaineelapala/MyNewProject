package com.patterns;

public class PatternDemo3 {

	public static void main(String[] args) {
		int r = 5;
		int c = 9;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				if (j < r + i && j > r - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= r-1; i++) {
			for (int j = 1; j <= c; j++) {
				if (j > i && j <= c - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//***************************************************
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= r - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= r - 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (r - i) * 2 - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
