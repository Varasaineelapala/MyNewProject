package com.languagefundamentals;

public class Cars {
	String brand;
	String model;
	double price;
	int horsePower;

	Cars() {
		this("unknown", "unknown", 0, 0);
	}

	Cars(String brand) {
		this(brand, "unknown", 0, 0);
	}

	Cars(String brand, String model) {
		this(brand, model, 0, 0);
	}

	Cars(String brand, String model, double price) {
		this(brand, model, price, 0);
	}

	Cars(String brand, String model, double price, int horsePower) {
		this.brand = brand;
		this.model = model;
		this.price=price;
		this.horsePower = horsePower;
	}

	void display() {
		System.out.println("====================================");
		System.out.println("Car Brand : " + brand);
		System.out.println("Car Model : " + model);
		System.out.println("Car Price : " + price +" /-");
		System.out.println("Car Horsepower : " + horsePower +" bhp");

	}

	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.display();
		Cars c2 = new Cars("Tata");
		c2.display();
		Cars c3 = new Cars("Maruthi Suzuki","swift VXI");
		c3.display();
		Cars c4 = new Cars("Hyundai","Creta",1850000);
		c4.display();
		Cars c5 = new Cars("Tata Nexon","Fearless",1250000.0,118);
		c5.display();

	}

}
