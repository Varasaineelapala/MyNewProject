package com.languagefundamentals;

public class BankAccount {
	String accountNumber;
	String accountHolderName;
	double balance;

	BankAccount(String accountNumber, String accountHolderName, double balance) {

		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	BankAccount(BankAccount ba) {
		this.accountNumber = ba.accountNumber;
		this.accountHolderName = ba.accountHolderName;
		this.balance = ba.balance;

	}

	void display() {
		System.out.println("Account Number      : " + accountNumber);
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Account Balance     : " + balance);
		System.out.println("=======================================");
	}

	void deposit() {
		this.balance = balance + 5000;
	}

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount("SBI90002902990", "varasai", 2000);
		ba1.display();

		BankAccount ba2 = new BankAccount(ba1);
		ba2.deposit();
		ba2.display();
		
		
	}

}
