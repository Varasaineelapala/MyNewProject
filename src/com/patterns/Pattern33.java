package com.patterns;

public class Pattern33 {

	public static void main(String[] args) {
		int n = 3;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}

}
