package com.exceptionhandling;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidPasswordException extends Exception {
	InvalidPasswordException() {

	}

	InvalidPasswordException(String str) {
		super(str);
	}
}

public class PasswordChecker {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password : ");
		String password = sc.next();
		try {
			if (password.length() < 8) {
				throw new InvalidPasswordException("\nyour Password must contain 8 characters");
			} else {
				System.out.println("Password Accepted...!");
			}
		} catch (InvalidPasswordException i) {
			System.out.println(i.toString());
		}
		sc.close();
	}

}
