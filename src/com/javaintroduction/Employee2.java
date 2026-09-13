package com.javaintroduction;
import java.util.Scanner;
public class Employee2 {
	int empId;
	String name;
	String dept;
	int salary;
	Employee2(int empId, String name, String dept, int salary) {
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	void display() {
		System.out.println("===========================");
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Department: " + dept);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee2[] employee= new Employee2[4];
		
		for(int i=0;i<=3;i++) {
			System.out.println("Enter the details of the employee "+(i+1));
			System.out.print("Employee Id :");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.print("Employee Name :");
			String ename=sc.nextLine();
			System.out.print("Department :");
			String edept=sc.nextLine();
			System.out.print("Salary :");
			int sal=sc.nextInt();
			sc.nextLine();
			employee[i]=new Employee2(id,ename,edept,sal);
		}

		sc.close();
		for (Employee2 emp : employee) {
			emp.display();
		}

	}

}
