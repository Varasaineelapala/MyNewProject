package com.patterns;

public class Pattern40 {

	public static void main(String[] args) {
		int n = 5;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(ch++);
			}
			for (int k = i; k <= n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
