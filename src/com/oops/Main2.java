package com.oops;

class Vehicle {
	void start() {
		System.out.println("Vehicle started...!");
	}
	void stop() {
		System.out.println("Vehcle stopped ");
	}
}

class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Car started");
	}

	void drive() {
		System.out.println("Car is in driving mode ");
	}
}
public class Main2 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.start();
		c1.drive();
		Vehicle v1 = new Vehicle();
		v1.start();
		v1.stop();
		Vehicle v2 = new Car();
		v2.start();
		v2.stop();
		Car c2=(Car) new Vehicle();
		c2.drive();

	}

}
