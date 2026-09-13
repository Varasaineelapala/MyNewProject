package com.languagefundamentals;

public class TestDemo5 {
	String name;
	int age;

	TestDemo5(String name, int age) {
		this.name = name;
		this.age = age;
	}

	TestDemo5() {

	}

	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

	public static void main(String[] args) {
		TestDemo5 td = new TestDemo5("varasai", 23);
		td.display();
		TestDemo5 td1 = new TestDemo5();

		td1.name = "anil";
		td1.age = 25;
		td1.display();

	}

}
