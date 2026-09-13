package com.patterns;

public class Pattern34 {

	public static void main(String[] args) {
		int n = 3;
		for (char i = 'A'; i <= 'C'; i++) {
			for (char j = 'A'; j <= 'C'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("======");
		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			for (int j = 1; j <= n; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}

	}
}
