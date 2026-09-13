package com.oops;

class Address {
	String city;

	Address() {

	}

	public Address(String city) {
		this.city = city;
	}

	public Address(Address a) {
		this.city = a.city;
	}

}

public class Student {
	int sid;
	String name;
	double percentage;
	Address address;

	Student() {

	}

	public Student(int sid, String name, double percentage, Address address) {
		this.sid = sid;
		this.name = name;
		this.percentage = percentage;
		this.address = address;
	}

	public Student(Student s) {
		this.sid = s.sid;
		this.name = s.name;
		this.percentage = s.percentage;
		this.address = new Address(s.address);
	}

	void display() {
		System.out.println(sid);
		System.out.println(name);
		System.out.println(percentage);
		System.out.println(address.city);
	}

	public static void main(String[] args) {
		Address a1 = new Address("Gudivada");
		Student s1 = new Student(101, "sai", 70, a1);
		s1.display();
		Student s2 = new Student(s1);
		s2.address.city = "Hydrabad";
		s2.display();
	}

}
