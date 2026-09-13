package com.languagefundamentals;

public class EmployeeDetails {
	Integer empno = 101;
	String ename = "Vara Sai";
	String hiredate = "1/10/2026";
	Double bonus;
	Double bonusPurcentage=10d;

	static Double salary = 5000d;
	static Integer experience = 0;
	static Double annualSalary;
	static Double salaryWithBonus;

	{

		bonus = salary /bonusPurcentage ;
		salaryWithBonus = bonus + salary;
		annualSalary = salaryWithBonus * 12;
		salary = salaryWithBonus;
		experience++;

		System.out.println("Employee Name  : " + ename);
		System.out.println("Employee Id    : " + empno);
		System.out.println("Hiredate       : " + hiredate);
		System.out.println("Monthly Salary : " + salary);
		System.out.println("Annual salry   : " + annualSalary);
		System.out.println("Experience     : " + experience + " years");
		System.out.println("=================================");
		// display();

	}
//	void display (){
//		
//		System.out.println("Employee Name  : " + ename);
//		System.out.println("Employee Id    : " + empno);
//		System.out.println("Hiredate       : " + hiredate);
//		System.out.println("Monthly Salary : " + salary);
//		System.out.println("Annual salry   : " + annualSalary);
//		System.out.println("Experience     : " + experience + " years");
//		System.out.println("=================================");
//	}

	public static void main(String[] args) {

		new EmployeeDetails();
		new EmployeeDetails();
		new EmployeeDetails();
		new EmployeeDetails();
		

	}

}
