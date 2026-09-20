package com.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingDemo1 {
	static Scanner sc = new Scanner(System.in);

	static void takeInput() {
		try {
			System.out.print("Enter a Number : ");
			int s1 = Integer.parseInt(sc.next());
			System.out.print("Enter a Second Number : ");
			int s2 = Integer.parseInt(sc.next());
			int result = s1 / s2;
			System.out.println(result);
		} catch (NumberFormatException n) {
			System.err.println("Number format Exception");
		} catch (ArithmeticException a) {
			System.err.println("ArithmeticEception");
		} catch (Exception e) {

		}
		try {
			System.out.print("Enter the size of an array : ");
			int n = sc.nextInt();
			int[] arr = { 1, 2, 3, 4, 5 };
			System.out.print("Enter the index of the array you want to see : ");
			int t = sc.nextInt();
			System.out.println(arr[t]);
		} catch (ArrayIndexOutOfBoundsException a) {
			System.err.println("ArrayIndexOutOfBoundsException");
		}
	}

	public static void main(String[] args) {
		takeInput();
	}

}
