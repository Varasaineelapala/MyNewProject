package com.patterns;

public class Pattern29 {

	public static void main(String[] args) {
		int n = 3;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				count++;
				System.out.print(count);
			}
			System.out.println();
		}
	}

}
