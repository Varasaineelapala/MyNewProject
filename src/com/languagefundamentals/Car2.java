package com.languagefundamentals;

class Engine {
	String type;
	int horsePower;

	Engine(String type, int horsePower) {
		this.type = type;
		this.horsePower = horsePower;
	}

	Engine(Engine other) {
		this.type = other.type;
		this.horsePower = other.horsePower;
	}

}

public class Car2 {
	String model;
	double basePrice;
	Engine engine;

	Car2(String model, double basePrice, Engine engine) {
		this.model = model;
		this.basePrice = basePrice;
		this.engine = engine;
	}

	Car2(Car2 other) {
		this.model = other.model;
		this.basePrice = other.basePrice;
		this.engine = new Engine(other.engine);
	}

	void display() {
		System.out.println("============================");
		System.out.println("Car Model   :" + model);
		System.out.println("Base Price  :" + basePrice);
		System.out.println("Engine Type :" + engine.type);
		System.out.println("Horse Power :" + engine.horsePower);
	}

	public static void main(String[] args) {
		Engine e1 = new Engine("V8", 150);
		Car2 c1 = new Car2("Cruiser", 150000, e1);
		c1.display();

		Car2 c2 = new Car2(c1);
		c2.engine.type = "V6";
		c2.engine.horsePower = 450;
		c2.model = "Cruiser sport";
		c2.basePrice = 35000;
		c2.display();

		c1.display();
		System.out.println("=============================");

	}

}
