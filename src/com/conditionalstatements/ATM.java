package com.conditionalstatements;

import java.util.Scanner;

public class ATM {
	static int count;
	static Scanner sc = new Scanner(System.in);
	static int pin = 1234;
	static double balance = 20000;
	static double withdrawlLimit = 1000;
	String opt;

	void withdraw() {
		System.out.print("Enter Your pin Number : ");
		int p = sc.nextInt();
		if (p == pin) {
			
			System.out.print("Enter ammount to withdraw : ");
			double amount = sc.nextDouble();
			if (amount <= balance) {
				if (amount <= withdrawlLimit) {
				balance = balance - amount;
				withdrawlLimit = withdrawlLimit - amount;
				System.out.println("withdraw Successful");
				}else {
					System.out.println("You exceeded you daily limit of withdrawl please try again Tomorrow...!");
				}
			} else {
				System.out.println("insufficient Balnce");
			}
		} else {
			System.out.println("Invalid pin Please try again with valid pin...!");
		}

	}

	void checkBalance() {
		System.out.print("Enter Your pin Number : ");
		int p = sc.nextInt();
		if (p == pin) {
			if (count < 2) {
				System.out.println("Your current account balance " + balance);
				count++;
			} else {
				System.out.println("You exceeded you daily limet please try again tomorrow");
			}
		} else {
			System.out.println("Invalid pin Please try again with valid pin...!");
		}
	}

	public static void main(String[] args) {
		ATM a = new ATM();
		do {
			System.out.println("Enter 1 to check baklance ");
			System.out.println("Enter 2 to with draw ");
			System.out.print("Enter you choice : ");
			
			int op = sc.nextInt();
			switch (op) {
			case 1 -> {
				a.checkBalance();
			}
			case 2 -> {
				a.withdraw();
			}
			default -> System.out.println("Enter a valid option");

			}
			System.out.println("---------------------------------------------------------");
			System.out.println("Do you want to continue press Y to continues N to exit");
			a.opt = sc.next();
		} while (a.opt.equalsIgnoreCase("y"));

	}

}
