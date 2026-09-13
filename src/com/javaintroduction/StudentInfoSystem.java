package com.javaintroduction;

public class StudentInfoSystem {
	int rollNumber=96;
	String StudentName="Vara Sai";
	int age=23;
	char gender='M';
	char section='B';
	boolean passedStatus;
	String grade="B+";
	Integer marks;
	float percentage=90;
	void display(){
		System.out.println("Student Name :"+StudentName);
		System.out.println("Roll Number :"+rollNumber);
		System.out.println("Age :"+age);
		System.out.println("Gender :"+gender);
		System.out.println("Section :"+section);
		System.out.println("Grade :"+grade);
		System.out.println("Marks :"+marks);
		System.out.println("Passed Status :"+passedStatus);
		
	}
	
	public static void main(String[] args) {
		StudentInfoSystem sis=new StudentInfoSystem();
		sis.display();
	}

}
