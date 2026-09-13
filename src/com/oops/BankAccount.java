package com.oops;

import java.util.Scanner;

class Account {
	private String accountNumber;
	private double balance;

	void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	Account(){
		
	}

	Account(double balance) {
		this.balance = balance;
	}

	String getAccountNumber() {
		return accountNumber;
	}

	double getBalance() {
		return balance;
	}

	void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		} else {
			System.out.println("deposit amount should not be negative please enter valied amount...");
		}
	}
	void withdraw(double cash) {
		if ( cash < balance && cash > 0 ) {
			balance = balance - cash;
		} else {
			System.out.println("deposit amount should not be greater than balance please enter valied amount...");
		}
	}
}
	public class BankAccount {
		String accountNumber;
		double balance;

		BankAccount() {

		}

		BankAccount(String accountNumber) {
			this.accountNumber = accountNumber;
		}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Account Number :");
		String num =sc.nextLine();
		BankAccount ba = new BankAccount(num);
		Account acc = new Account(0);

		System.out.print("Enter anount to diposit :");
		double amount = sc.nextDouble();
		acc.deposit(amount);
		
		System.out.print("Enter anount to diposit :");
		double cash = sc.nextDouble();
		acc.withdraw(cash);
		

		acc.setAccountNumber(ba.accountNumber);
		System.out.println("Account Number          : "+acc.getAccountNumber());
		System.out.println("Current Account Balance : "+acc.getBalance());

	}

	}
