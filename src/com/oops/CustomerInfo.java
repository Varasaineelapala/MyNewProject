package com.oops;

import java.util.Scanner;

public class CustomerInfo {
	static void display(Customer c1) {
		System.out.println("Customer ID : "+c1.getCustomerId());
		System.out.println("Customer Name : "+c1.getName());
		System.out.println("Customer Phone Number : "+c1.getPhoneNumber());
		System.out.println("Customer Email Id : "+c1.getEmail());
	}

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter customer id : ");
		int cid = sc.nextInt();
		sc.nextLine();
		c1.setCustomerId(cid);

		System.out.print("Enter customer name : ");
		String name = sc.nextLine();
		c1.setName(name);

		System.out.print("Enter phone number : ");
		long ph = sc.nextLong();
		sc.nextLine();
		c1.setPhoneNumber(ph);

		System.out.print("Enter Email ID : ");
		String email = sc.nextLine();
		c1.setEmail(email);
		
		display(c1);
	}
}