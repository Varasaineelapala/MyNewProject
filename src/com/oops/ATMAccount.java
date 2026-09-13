package com.oops;

import java.util.Scanner;

public class ATMAccount {

	private double balance = 5000;
	int pin = 1234;

	void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		} else {
			System.err.println("deposite Amount must be positive...!");
		}
	}

	void withdraw(double amount) {
		if (amount > 0) {
			if (amount < balance) {
				balance = balance - amount;
			} else {
				System.err.println("Insuficiant acccount balance...!");
			}
		} else {
			System.err.println("withdrawl amount must be positive...!");
		}
	}

	void checkBalance() {
		System.out.println("You account balance : " + balance);
	}

	public static void main(String[] args) {
		ATMAccount a1 = new ATMAccount();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your ATM pin : ");
		int pin = sc.nextInt();
		if (pin == a1.pin) {
			System.out.println("Enter \"1\" To check balance : ");
			System.out.println("Enter \"2\" To Deposit : ");
			System.out.println("Enter \"3\" To Withdraw : ");
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				a1.checkBalance();
				break;
			}
			case 2: {
				System.out.print("Enter amount to deposit : ");
				double amount = sc.nextDouble();
				a1.deposit(amount);
				a1.checkBalance();
				break;
			}
			case 3: {
				System.out.print("Enter amount to withdraw : ");
				double amount = sc.nextDouble();
				a1.withdraw(amount);
				a1.checkBalance();
				break;
			}
			default: {
				System.err.println("please enter a valid option...!");
				break;
			}
			}
		} else {
			System.err.println("Invalid pin please Try again with valid pin...!");
		}
		sc.close();

	}

}
