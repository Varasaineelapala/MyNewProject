package com.exceptionhandling;

import java.util.Scanner;

class DuplicateUsernameException extends Exception {
	DuplicateUsernameException() {

	}

	DuplicateUsernameException(String str) {
		super(str);
	}
}

public class CustomExceptionDemo2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter you name : ");
			String[] names = { "sai", "vara" };
			try {
				String name = sc.nextLine();
				for (String n : names) {
					if (n.equalsIgnoreCase(name)) {
						throw new DuplicateUsernameException();
					}
				}
				System.out.println("account created successfully..!");
			} catch (DuplicateUsernameException d) {
				System.out.println(d.toString());
			}
		}
	}

}
