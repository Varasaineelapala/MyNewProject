package com.patterns;

public class Pattern22 {

	public static void main(String[] args) {
		int r = 5;
		int starHash = 1;
		int spaces = r - 1;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= starHash; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= starHash; l++) {
				System.out.print("#");
			}
			System.out.println();
			spaces--;
			starHash++;
		}
	}

}
