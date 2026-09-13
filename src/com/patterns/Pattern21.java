package com.patterns;

public class Pattern21 {

	public static void main(String[] args) {
		int r = 4;
		int tr = r * 2 - 1;
		int star = 1;
		int spaces = r - 1;
		for (int i = 1; i <= tr; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < r) {
				star++;
				spaces--;
			} else {
				star--;
				spaces++;

			}
		}
	}

}
