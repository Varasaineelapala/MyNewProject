package com.patterns;

public class PascalsTriangle {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int val = 1;
			for (int j = 5 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(val + " ");
				val = val * (i - k) / k;
			}
			System.out.println();
		}
	}
}
