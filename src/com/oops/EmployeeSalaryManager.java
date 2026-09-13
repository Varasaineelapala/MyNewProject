package com.oops;

class Employees {
	double salary = 40000;

	void calculateSalary() {
		System.out.println("Employee salary : " + salary);
	}
}

class Developers extends Employees {
	double salary = 30000;

	@Override
	void calculateSalary() {
		System.out.println("Developer salary : " + salary);
	}
}

class Tester extends Employees {

	double salary = 20000;

	@Override
	void calculateSalary() {
		System.out.println("Tester's salary : " + salary);
	}
}

class Manager extends Employees {
	double salary = 35000;

	@Override
	void calculateSalary() {
		System.out.println("Manager's salary : " + salary);
	}
}

public class EmployeeSalaryManager {

	public static void main(String[] args) {
		Employees e = new Employees();
		Developers d = new Developers();
		Tester t = new Tester();
		Manager m = new Manager();

		e.calculateSalary();
		d.calculateSalary();
		t.calculateSalary();
		m.calculateSalary();

	}

}
