package com.oops;

class Employee {

	double salary = 30000;
	double totalSalary;

	void calculateSalary() {
		System.out.println("Employee salary : " + salary);
	}

	void calculateSalary(double bonus) {
		totalSalary = salary + bonus;
		System.out.println("Employee salary with bonus : " + totalSalary);
	}
}

class Developer extends Employee {
	double salary = 40000;

	@Override
	void calculateSalary() {
		System.out.println("Developer salary : " + salary);
	}

	@Override
	void calculateSalary(double bonus) {
		totalSalary = salary + bonus;
		System.out.println("Developer salary with bonus : " + totalSalary);

	}
}

public class EmployeeSalarySystem {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Developer d1 = new Developer();
		e1.calculateSalary();
		e1.calculateSalary(2000);
		d1.calculateSalary();
		d1.calculateSalary(2000);

	}

}
