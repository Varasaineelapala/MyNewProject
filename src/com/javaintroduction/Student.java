/*Problem 2: The Student Tracker & Global Counter (Focus: Static Variables)
Scenario: A school wants to track student registrations and automatically 
count how many total students have been admitted.

Task: Create a Student class with instance fields for rollNo (int) and name
 (String). Add a static integer field called studentCount.

Requirements:

Modify your constructor so that every time a new Student object is created 
via the new keyword, the studentCount variable automatically increments by 1.

In your main method, use a loop to take input for 3 students from the keyboard,
 store them in a Student[] array, and call a display() method on each.

At the very end of your program (outside all loops), print the total number 
of students registered by accessing the static variable directly via the 
class name (e.g., System.out.println(Student.studentCount);).*/

package com.javaintroduction;

import java.util.Scanner;

public class Student {
	int rollNumber;
	String name;
	static int studentCounter = 0;

	Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
		studentCounter++;
	}

	void display() {
		System.out.println("============================");
		System.out.println("Roll Number :" + rollNumber);
		System.out.println("Name :" + name);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stud = new Student[3];
		for (int i = 0; i <= 2; i++) {
			System.out.println("Enter the details of student " + (i + 1));
			System.out.print("Roll Number :");
			int rn = sc.nextInt();
			sc.nextLine();
			System.out.print("Name :");
			String name = sc.nextLine();
			stud[i] = new Student(rn, name);

		}
		sc.close();
		for (Student st : stud) {
			st.display();
		}
		System.out.println("Number of students registered :" + Student.studentCounter);
	}

}
