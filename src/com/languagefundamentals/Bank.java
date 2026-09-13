package com.languagefundamentals;

public class Bank {
	double balance=10000;
	void checkBalance() {
		System.out.println("Current account Balance : "+ balance);
	}
	void deposit(double cash) {
		System.out.println("Amount to deposit : "+cash);
		balance=balance+cash;
		checkBalance();
	}
	void withDraw() {
		double cash=4000;
		System.out.println("Amount to withdraw : "+cash);
		balance=balance-cash;
		checkBalance();
	}

	public static void main(String[] args) {
		Bank sbi=new Bank();
		sbi.deposit(5000);
		sbi.withDraw();
	}

}
