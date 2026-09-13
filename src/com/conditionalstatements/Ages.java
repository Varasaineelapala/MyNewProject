package com.conditionalstatements;

import java.util.Scanner;

public class Ages {
	int age;

	public static void main(String[] args) {
		Ages a = new Ages();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter age : ");
		a.age = sc.nextInt();

		if (a.age > 0 && a.age < 1) {
			System.out.println("Infant");
		} else if (a.age >= 1 && a.age <= 3) {
			System.out.println("toddler");
		} else if (a.age >= 4 && a.age <= 12) {
			System.out.println("child");
		} else if (a.age >= 13 && a.age <= 19) {
			System.out.println("teenager");
		} else if (a.age >= 20 && a.age <= 39) {
			System.out.println("youth");
		} else if (a.age >= 40 && a.age <= 59) {
			System.out.println("middleaged");
		} else {
			System.out.println("too old...");
		}

	}

}
