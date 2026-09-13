package com.languagefundamentals;

import java.util.Scanner;

public class EmployeeDetails2 {
	String ename;
	int eid;
	int age;
	double salary;
	long ph;
	String city; 
	
	public static EmployeeDetails2 getEmpDetails() {
		EmployeeDetails2 e=new EmployeeDetails2();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Employee Name :");
		e.ename=sc.nextLine();
		System.out.print("Enter the Employee id :");
		e.eid=sc.nextInt();
		System.out.print("Enter the Employee age :");
		e.age=sc.nextInt();
		System.out.print("Enter the Employee salary :");
		e.salary=sc.nextDouble();
		System.out.print("Enter the Employee phone number :");
		e.ph=sc.nextLong();
		sc.nextLine();
		System.out.print("Enter the Employee city :");
		e.city=sc.nextLine();
		
		return e;
	}
	public static void main(String[] args) {
		EmployeeDetails2 emp=EmployeeDetails2.getEmpDetails();
		System.out.println("========================================");
		System.out.println("Employee Name : "+emp.ename);
		System.out.println("Employee ID   : "+emp.eid);
		System.out.println("Age           : "+emp.age);
		System.out.println("Salary        : "+emp.salary+"/-");
		System.out.println("Phone Number  : "+emp.ph);
		System.out.println("City          : "+emp.city);
	}

}
