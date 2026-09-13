package com.languagefundamentals;

public class EmpDetails {
	String empName;
	int empId;
	char gender;
	String hiredate;
	double salary;

	EmpDetails(String empName, int empId, char gender, String hiredate, double salary) {
		 this.empName=empName;
		 this.empId=empId;
		 this.gender=gender;
		 this.hiredate=hiredate;
		 this.salary=salary;
	}

	EmpDetails(int empId, String empName, char gender, String hiredate, double salary) {
		this.empName=empName;
		 this.empId=empId;
		 this.gender=gender;
		 this.hiredate=hiredate;
		 this.salary=salary;
	}

	EmpDetails(String empName, int empId, char gender, String hiredate) {
		this.empName=empName;
		 this.empId=empId;
		 this.gender=gender;
		 this.hiredate=hiredate;
		 
	}

	EmpDetails(String empName, int empId, char gender) {
		this.empName=empName;
		 this.empId=empId;
		 this.gender=gender;
		 
	}

	EmpDetails(String empName, int empId) {
		this.empName=empName;
		 this.empId=empId;
		 
	}

	EmpDetails() {

	}
	void display() {
		System.out.println("Employee Name     : "+empName);
		System.out.println("Employee Id       : "+empId);
		System.out.println("Employee gender   : "+gender);
		System.out.println("Employee hiredate : "+hiredate);
		System.out.println("Employee Salary   : "+salary);
		System.out.println("====================================");
	}

	public static void main(String[] args) {
		EmpDetails ed =new EmpDetails("varasai",104,'M',"10/10/2026",35000);
		ed.display();
		EmpDetails ed1 =new EmpDetails(105,"Anil",'M',"10/08/2026",30000);
		ed1.display();
		EmpDetails ed2 =new EmpDetails("Chandra",106,'M',"10/08/2026");
		ed2.salary=35000;
		ed2.display();
		EmpDetails ed3 =new EmpDetails("Tarun",107,'M');
		ed3.hiredate="08/08/2026";
		ed3.salary=30000;
		ed3.display();
		EmpDetails ed4 =new EmpDetails("Kumar",108);
		ed4.gender='F';
		ed4.hiredate="10/08/2026";
		ed4.salary=30000;
		ed4.display();
		EmpDetails ed5 =new EmpDetails();
		ed5.empName="Shekar";
		ed5.empId=109;
		ed5.gender='F';
		ed5.hiredate="10/08/2026";
		ed5.salary=30000;
		ed5.display();
	}

}
