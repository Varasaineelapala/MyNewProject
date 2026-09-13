package com.patterns;

public class DoubleHourGlass {

	public static void main(String[] args) {
		int n = 5;
		int space = 2;
		int stars = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space / 2; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= stars; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= space; l++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= stars; m++) {
				System.out.print("*");

			}
			if (i < n / 2 + 1) {
				stars -= 2;
				space += 2;
			} else {
				stars += 2;
				space -= 2;

			}

			System.out.println();
		}
	}

}
