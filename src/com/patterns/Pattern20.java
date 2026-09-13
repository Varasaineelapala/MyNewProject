package com.patterns;

public class Pattern20 {

	public static void main(String[] args) {
		int r = 4;
		int tr = 2 * r - 1;
		int star = 1;
		for (int i = 1; i <= tr; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < r) {
				star++;
			} else {
				star--;
			}
		}
	}

}
