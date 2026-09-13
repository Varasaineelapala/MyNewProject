package com.languagefundamentals;

public class College {
	String name;
	String city;
	int numberOfStudents;

	College() {
		this("ANR");
		System.out.println("No arg constructor called");
		
	}

	College(String name) {
		this(name, "Gudivada");
		System.out.println("one arg constructor called");
	}

	College(String name, String city) {
		this(name, city, 5000);
		System.out.println("Two arg constructor called");

	}

	College(String name, String city, int numberOfStudents) {
		System.out.println("Three arg constructor called");
		this.name=name;
		this.city=city;
		this.numberOfStudents=numberOfStudents;
	}

	void display() {
		System.out.println("=========================");
		System.out.println("College Name : " + name);
		System.out.println("City : " + city);
		System.out.println("numberOfStudent : " + numberOfStudents);
	}

	public static void main(String[] args) {
		College c1 = new College();
		c1.display();
		

	}

}
