package com.conditionalstatements;

import java.util.Scanner;

public class MobileRecharge {
	static Scanner sc = new Scanner(System.in);
	double amount;
	static double wallet=700;
	void check() {
		System.out.print("Enter a recharge plan : ");
		amount=sc.nextDouble();
		if (amount==299||amount==349||amount==499||amount==899) {
			if (amount < wallet) {
				recharge(amount);
			}else {
				System.out.println("Insuficient balance ");
			}
		}else {
			System.out.println("Invalied plan please enter a valid plan...!");
		}
	}
	void recharge(double amount) {
		wallet=wallet-amount;
		System.out.println("Your recharge with "+ amount + "is Successful ");
		System.out.println("Wallet balance "+wallet);
		System.out.println("----------------------------------------------");
	}
	public static void main(String[] args) {
		MobileRecharge mr=new MobileRecharge();
		mr.check();
		MobileRecharge mr1=new MobileRecharge();
		mr1.check();
		MobileRecharge mr2=new MobileRecharge();
		mr2.check();
		
	}

}
