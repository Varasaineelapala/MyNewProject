package com.languagefundamentals;

class BankAccount1 {
	String accountNumber;
	String accountHolderName;
	double balance;

	BankAccount1() {

	}

	BankAccount1(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	void display() {
		System.out.println("Account Number      :" + accountNumber);
		System.out.println("Account Holder Name :" + accountHolderName);
		System.out.println("Account Balance     :" + balance);
	}

}

class SavingsAccount extends BankAccount {
	double interestRate;
	SavingsAccount() {
		this("ANB1000353384770006","Varasai",1000,0.04);
	}

	SavingsAccount(String accountNumber, String accountHolderName, double balance,double interestRate) {
		super(accountNumber,accountHolderName,balance);
		this.interestRate=interestRate;
	}
	void display()
	{
		super.display();
		System.out.println("Interest Rate       :"+interestRate);
		
	}
}

public class BankAccounts {

	public static void main(String[] args) {
		SavingsAccount sv=new SavingsAccount();
		sv.display();

	}

}
