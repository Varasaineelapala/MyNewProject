/*Problem 3: The System Configurator (Focus: Static Blocks & JVM Lifecycle)
Scenario: A secure banking portal needs to verify that
 database configurations are loaded into memory before 
 any customer transactions can be entered from the keyboard.

Task: Create a BankAccount class with fields for
 accountNumber (int) and balance (double).
Requirements:
Add a static block to your class that prints:
 "[SYSTEM] Connecting to secure database server..." 
and "[SYSTEM] Encryption keys verified."
Inside your main method, create a loop to accept inputs for 
2 accounts and save them into a BankAccount[] array.
Run your code and observe how the console prints the static block text first,
demonstrating that the JVM ClassLoader subsystem initializes 
static code before executing the main loop.*/
package com.javaintroduction;

import java.util.Scanner;

public class BankAccount {
	int accountNumber;
	double balance;
	BankAccount(int accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	void display() {
		System.out.println("accountNumber :"+accountNumber);
		System.out.println("balance :"+balance);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount[] bk = new BankAccount[2];
		for(int i=0;i<=1;i++) {
			System.out.print("Enter your Account Number :");
			int an=sc.nextInt();
			sc.nextLine();
			System.out.print("Balance :");
			double bal=sc.nextDouble();
			sc.nextLine();
			bk[i]=new BankAccount(an,bal);
		}
sc.close();
for(BankAccount bkk : bk) {
	bkk.display();
}
	
	}
static {
	System.out.println("[SYSTEM] Connecting to secure database server...");
	System.out.println("[SYSTEM] Encryption keys verified.");
}
}
