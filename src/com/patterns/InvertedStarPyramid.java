package com.patterns;

public class InvertedStarPyramid {

	public static void main(String[] args) {
		int n = 5;
		int stars = n * 2 - 1;
		int spaces = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= stars; l++) {
				System.out.print("*");
			}
			System.out.println();
			stars -= 2;
			spaces++;
		}
	}

}
