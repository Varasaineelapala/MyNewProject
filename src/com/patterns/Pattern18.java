package com.patterns;

public class Pattern18 {
	static void bv() {
		int i = 1;
		int r = 5;
		int tr = r * 2 - 1;
		int star = 1;
		int spaces = r - 1;
		for (; i <= tr; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < r) {
				spaces--;
				star += 2;
			} else {
				spaces++;
				star -= 2;
			}
		}

	}

	public static void main(String[] args) {
		int r = 5;
		int c = r * 2 - 1;
		for (int i = 1; i <= r; i++) {
			for (int j = i; j < r; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < r; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= c - i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		bv();
	}

}
