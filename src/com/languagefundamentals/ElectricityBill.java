package com.languagefundamentals;

import java.util.Scanner;
public class ElectricityBill {

	void calculateBill(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter customer's name : ");
		String name=sc.nextLine();
		System.out.print("Enter the number  of units consumed : ");
		int units=sc.nextInt();
		int fixedRate=5;
		double bill=units*fixedRate;
		System.out.println("=========================");
		System.out.println("Customer Name  : "+name);
		System.out.println("Units consumed : "+units);
		System.out.println("Total Bill     : "+bill);
		sc.close();
	}
	public static void main(String[] args) {
		ElectricityBill eb=new ElectricityBill ();
		eb.calculateBill();
		    
	}

}
