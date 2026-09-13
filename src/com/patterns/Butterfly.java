package com.patterns;

public class Butterfly {

	public static void main(String[] args) {
		int r=6;
		int c=r*2;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				if (j > i && j <= c - i) {
					System.out.print(" ");
				} else {
					System.out.print("*"); 
				}
			}
			System.out.println();
		}
		for (int i = 1; i < r; i++) {
			for (int j = 1; j <= c; j++) {
				if (j <= r + i && j > r - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}

}
