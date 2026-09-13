package com.javaintroduction;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String rev = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);

		}
		System.out.println(rev);
		sc.close();

	}
}
