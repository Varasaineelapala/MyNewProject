package com.languagefundamentals;

class Department {
	String dname;
	int deptno;
	String loc;

	Department() {

	}

	Department(String dname, int deptno, String loc) {
		this.dname = dname;
		this.deptno = deptno;
		this.loc = loc;
	}

	void display() {
		System.out.println("Department Name   : " + dname);
		System.out.println("Department Number : " + deptno);
		System.out.println("Location          : " + loc);

	}
}

class Employee extends Department {
	String ename;

	Employee() {

	}

	Employee(String dname, int deptno, String loc, String ename) {
		super(dname, deptno, loc);
		this.ename = ename;
	}

	void display() {
		super.display();
		System.out.println("Employee Name     : " + ename);

	}
}

public class DepartmentEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee("research", 20, "New York", "sai");
		e1.display();
	}

}
