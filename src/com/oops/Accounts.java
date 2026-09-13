package com.oops;

abstract class Account2 {
	static void info() {
		System.out.println("This is a static method ");
	}

	void name() {
		System.out.println("This is a concreate method ");
	}

	public abstract void balance();
}

class SBiAccount extends Account2 {

	@Override
	public void balance() {
		System.out.println("SBI Account balance 0!");
	}

}

class UnionAccount extends Account2 {

	@Override
	public void balance() {
		System.out.println("Union Account balance 0!");
	}

}

public class Accounts {

	public static void main(String[] args) {

		Account2.info();
		Account2 sbi = new SBiAccount();
		sbi.balance();
		Account2 union = new UnionAccount();
		union.balance();
		union.name();
		
	}

}
