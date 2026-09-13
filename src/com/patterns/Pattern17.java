package com.patterns;

public class Pattern17 {

	public static void main(String[] args) {
		int r = 5;
		int c = r * 2;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= c + 1 - i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
