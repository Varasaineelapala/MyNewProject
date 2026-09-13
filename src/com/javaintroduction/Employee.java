package com.javaintroduction;

public class Employee {
	int employeeId;
	String employeeName;
	int salary;
	String department;
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.employeeId=001;
		emp1.employeeName="Sai";
		emp1.salary=30000;
		emp1.department="Engineering";
		System.out.println("Employee Id: "+emp1.employeeId);
		System.out.println("Employee Name: "+ emp1.employeeName);
		System.out.println("Salary: "+emp1.salary);
		System.out.println("Department: "+emp1.department);
		
		Employee emp2=new Employee();
		emp2.employeeId=002;
		emp2.employeeName="Phani";
		emp2.salary=20000;
		emp2.department="Finance";
		System.out.println("Employee Id: "+emp2.employeeId);
		System.out.println("Employee Name: "+ emp2.employeeName);
		System.out.println("Salary: "+emp2.salary);
		System.out.println("Department: "+emp2.department);
		
		Employee emp3=new Employee();
		emp3.employeeId=003;
		emp3.employeeName="Nikhil";
		emp3.salary=20000;
		emp3.department="HR";
		System.out.println("Employee Id: "+emp3.employeeId);
		System.out.println("Employee Name: "+ emp3.employeeName);
		System.out.println("Salary: "+emp3.salary);
		System.out.println("Department: "+emp3.department);
		
		Employee emp4=new Employee();
		emp4.employeeId=004;
		emp4.employeeName="Murali";
		emp4.salary=35000;
		emp4.department="Finance";
		System.out.println("Employee Id: "+emp4.employeeId);
		System.out.println("Employee Name: "+ emp4.employeeName);
		System.out.println("Salary: "+emp4.salary);
		System.out.println("Department: "+emp4.department);
		
		
	}

}
