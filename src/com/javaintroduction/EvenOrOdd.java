package com.javaintroduction;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.print("Enter the range of the array :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements :");
		System.out.print("\n");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("The array elements are :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		int odd = arr.length - count;
		System.out.println("\nNumber of even numbers present in the list are :" + count);
		
		System.out.println("number of odd number of present in the list are :" + odd);
		sc.close();

	}
}
