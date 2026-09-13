package com.patterns;

public class Pattern38 {

	public static void main(String[] args) {
		int n = 5;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();

		}
	}

}
