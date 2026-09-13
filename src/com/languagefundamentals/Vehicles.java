package com.languagefundamentals;

class Vehicle {
	String registrationNumber;
	double fuelCapacity;
	String fuelType;

	Vehicle() {

	}

	Vehicle(String registrationNumber, double fuelCapacity, String fuelType) {
		this.registrationNumber = registrationNumber;
		this.fuelCapacity = fuelCapacity;
		this.fuelType = fuelType;
	}

	void display() {

		System.out.println("Registration number : " + registrationNumber);
		System.out.println("Fuel Capacity       : " + fuelCapacity);
		System.out.println("Fuel Type           : " + fuelType);
		
	}

}

class Carr extends Vehicle {
	int seatingCapacity;
	boolean hasSunroof;

	Carr() {

	}

	Carr(String registrationNumber, double fuelCapacity, String fuelType, int seatingCapacity, boolean hasSunroof) {
		super(registrationNumber, fuelCapacity, fuelType);
		this.seatingCapacity = seatingCapacity;
		this.hasSunroof = hasSunroof;
	}

	void display() {
		super.display();
		System.out.println("Seating Capacity    : " + seatingCapacity);
		System.out.println("Has Sunroof         : " + hasSunroof);
		System.out.println("=================================");
	}
}

public class Vehicles {

	public static void main(String[] args) {
		Carr c1 = new Carr("Random Car", 35, "Sometype", 4, true);
		c1.display();

	}

}
