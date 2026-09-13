package com.oops;

class Student2 {
	int studentId;
	String studentName;
	int marks;

	Student2(int studentId, String studentName, int marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}

	void calculateGrade() {
		display();
		if (marks < 0 || marks > 100) {
			System.out.println("Invalid marks..!");
			return;
		} else if (marks >= 90) {
			System.out.println("Grade : A ");
		} else if (marks < 90 && marks >= 80) {
			System.out.println("Grade : B ");
		} else if (marks < 80 && marks >= 70) {
			System.out.println("Grade : C ");
		} else if (marks < 70 && marks >= 60) {
			System.out.println("Grade : D ");
		} else if (marks < 60 && marks >= 50) {
			System.out.println("Grade : E ");
		} else if (marks < 50) {
			System.out.println("Grade : F ");
		}

	}

	void display() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
	}
}

class EngineeringStudent extends Student2 {

	EngineeringStudent(int studentId, String studentName, int marks) {
		super(studentId, studentName, marks);
	}

	@Override
	void calculateGrade() {
		display();
		if (marks < 0 || marks > 100) {
			System.out.println("Invalid marks..!");
			return;
		} else if (marks >= 95) {
			System.out.println("Grade : A ");
		} else if (marks < 95 && marks >= 85) {
			System.out.println("Grade : B ");
		} else if (marks < 85 && marks >= 75) {
			System.out.println("Grade : C ");
		} else if (marks < 75 && marks >= 65) {
			System.out.println("Grade : D ");
		} else if (marks < 65 && marks >= 55) {
			System.out.println("Grade : E ");
		} else if (marks < 55) {
			System.out.println("Grade : F ");
		}

	}
}

class MedicalStudent extends Student2 {
	MedicalStudent(int studentId, String studentName, int marks) {
		super(studentId, studentName, marks);
	}

	@Override
	void calculateGrade() {
		display();
		if (marks < 0 || marks > 100) {
			System.out.println("Invalid marks..!");
			return;
		} else if (marks >= 90) {
			System.out.println("Grade : A ");
		} else if (marks < 90 && marks >= 75) {
			System.out.println("Grade : B ");
		} else if (marks < 75 && marks >= 60) {
			System.out.println("Grade : C ");
		} else if (marks < 60 && marks >= 45) {
			System.out.println("Grade : D ");
		} else if (marks < 45 && marks >= 30) {
			System.out.println("Grade : E ");
		} else if (marks < 30) {
			System.out.println("Grade : F ");
		}

	}
}

class ManagementStudent extends Student2 {
	ManagementStudent(int studentId, String studentName, int marks) {
		super(studentId, studentName, marks);
	}

	@Override
	void calculateGrade() {
		display();
		if (marks < 0 || marks > 100) {
			System.out.println("Invalid marks..!");
			return;
		} else if (marks >= 95) {
			System.out.println("Grade : A ");
		} else if (marks < 95 && marks >= 80) {
			System.out.println("Grade : B ");
		} else if (marks < 80 && marks >= 65) {
			System.out.println("Grade : C ");
		} else if (marks < 65 && marks >= 40) {
			System.out.println("Grade : D ");
		} else if (marks < 40 && marks >= 25) {
			System.out.println("Grade : E ");
		} else if (marks < 25) {
			System.out.println("Grade : F ");
		}

	}
}

public class Main4 {

	public static void main(String[] args) {

		Student2 s1 = new EngineeringStudent(101, "sai", 47);
		Student2 s2 = new MedicalStudent(102, "alice", 55);
		Student2 s3 = new ManagementStudent(103, "bob", 65);
		s1.calculateGrade();
		System.out.println("----------------------");
		s2.calculateGrade();
		System.out.println("----------------------");
		s3.calculateGrade();

	}

}
