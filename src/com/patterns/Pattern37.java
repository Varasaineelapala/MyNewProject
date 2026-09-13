package com.patterns;

public class Pattern37 {

	public static void main(String[] args) {
		int n = 3;
		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}

}
