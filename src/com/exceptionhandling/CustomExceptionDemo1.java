package com.exceptionhandling;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
	InvalidAgeException(String str) {
		super(str);
	}

	InvalidAgeException() {
	}
}

public class CustomExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			try {
				if (age < 18) {
					throw new InvalidAgeException();
				} else {
					System.out.println("Reginstration succefull..!");
				}
			} catch (InvalidAgeException i) {
				System.out.println(i.toString());
			}
		}
		System.out.println("Main method ended");
	}
}
