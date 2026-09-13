package com.patterns;

public class HollowDiamond {

	public static void main(String[] args) {
		int r =5;
		int c = r * 2 - 1;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				if (j == (r - 1) + i || j == (r + 1) - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i < r; i++) {
			for (int j = 1; j <= c; j++) {
				if (j == i + 1 || j == c - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
