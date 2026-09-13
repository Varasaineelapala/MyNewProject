package com.oparators;

import java.util.Scanner;

public class TestDemoOp1 {

	double orderAmount;
	double percentage;
	int age;
	double balance;

	public static void main(String[] args) {
		TestDemoOp1 op = new TestDemoOp1();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter order amount :");
		op.orderAmount = sc.nextDouble();
		if (op.orderAmount >= 499) {
			System.out.println("eligible for free delivery ");
		} else {
			System.out.println("not eligible for freen delivery");
		}
		
		System.out.print("enter students percentage :");
		op.percentage=sc.nextDouble();
		System.out.println("Student is eligible for admission :"+(op.percentage>=75));
		
		System.out.print("enter the child age :");
		op.age=sc.nextInt();
		System.out.println("Ticket is available :"+(op.age>12));
		
		System.out.print("enter your balance :");
		op.balance=sc.nextDouble();
		System.out.println("Account balance meet the requirement :"+(op.balance>=1000));
		
		
		

	}

}
