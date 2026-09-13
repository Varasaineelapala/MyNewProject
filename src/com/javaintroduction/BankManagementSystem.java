package com.javaintroduction;

public class BankManagementSystem {

	static int accountNumber=1000;
	String customerName;
	double accountBalance;
//	{
//		accountNumber++;
//	}

	void show(int accountNumber) {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Account Balance: " + accountBalance);
		System.out.println();
	}

	public static void main(String[] args) {
		BankManagementSystem bms = new BankManagementSystem();
		bms.customerName = "sai";
		bms.accountBalance = 20000;
		bms.show(++accountNumber);
		BankManagementSystem bms1 = new BankManagementSystem();
		bms1.customerName = "chandu";
		bms1.accountBalance = 25000;
		bms1.show(++accountNumber);
		BankManagementSystem bms2 = new BankManagementSystem();
		bms2.customerName = "anil";
		bms2.accountBalance = 40000;
		bms2.show(++accountNumber);
		BankManagementSystem bms3 = new BankManagementSystem();
		bms3.customerName = "tarun";
		bms3.accountBalance = 10000;
		bms3.show(++accountNumber);
		BankManagementSystem bms4 = new BankManagementSystem();
		bms4.customerName = "kumar";
		bms4.accountBalance = 10000;
		bms4.show(++accountNumber);

	}

}
