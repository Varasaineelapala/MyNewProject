package com.javaintroduction;

public class Identifiers {
	String studentName="Vara Sai";
	int _age=23;
	double $salary=20000d;
	int rollNumber123=96;
//	String class ="";
	void display(){
		System.out.println("Name :"+studentName);
		System.out.println("Age :"+_age);
		System.out.println("Salary :"+$salary);
		System.out.println("Roll Number :"+rollNumber123);
	}
	
	public static void main(String[] args) {
		Identifiers ide=new Identifiers();
		ide.display();

	}

}
