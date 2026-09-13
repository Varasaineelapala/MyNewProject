package com.oops;

class Car2 implements Vehicles {

	@Override
	public void start() {
		System.out.println("Car started...!");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped...!");

	}

}

class Bike implements Vehicles {

	@Override
	public void start() {
		System.out.println("Bike started...!");
	}

	@Override
	public void stop() {
		System.out.println("Bike stopped...!");

	}
}

class Bus implements Vehicles {

	@Override
	public void start() {
		System.out.println("Bus started...!");
	}

	@Override
	public void stop() {
		System.out.println("Bus stopped...!");

	}
}

public class Main5 {

	public static void main(String[] args) {
		Vehicles car = new Car2();
		car.start();
		car.stop();
		Vehicles bike = new Bike();
		bike.start();
		bike.stop();
		Vehicles bus = new Bus();
		bus.start();
		bus.stop();
	}

}
