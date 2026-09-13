package com.javaintroduction;

public class Chocolate {
	static double price = 2.5;
	static double money = 365;

	public static void main(String[] args) {
		double numChoco = money / price;
		double bal = money % price;
		double freeChoco = numChoco / 5;
		double totalChoco = numChoco + freeChoco;
		System.out.println("number of chocolates you can buy with " + money + " : " + numChoco);
		System.out.println("Number of chocolates you will get for free  : " + freeChoco);
		System.out.println("Total number of chocolates you will get     : " + totalChoco);
		System.out.println("balance ammount you will have with you      : " + bal);
	}

}
