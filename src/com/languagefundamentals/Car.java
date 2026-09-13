package com.languagefundamentals;

public class Car {
	String brand;
	String model;
	double price;

	Car(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	void displayCarInfo() {
		System.out.println("Car Brand : " + brand);
		System.out.println("Car model : " + model);
		System.out.println("Car price : " + price);
	}

	public static void main(String[] args) {
		Car c1 = new Car("KIA", "Senet", 2000000);
		c1.displayCarInfo();
	}

}
