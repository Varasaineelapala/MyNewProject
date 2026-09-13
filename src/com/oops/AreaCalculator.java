package com.oops;

class Shape {
	double area;

	public double area(double a) {
		return area;
	}

	public double area(double a, double b) {
		return area;
	}
}

class Circle extends Shape {
	@Override
	public double area(double r) {
		area = Math.PI * (r * r);
		return area;
	}
}

class Rectangle extends Shape {
	@Override
	public double area(double h, double b) {
		area = h * b;
		return area;
	}
}

public class AreaCalculator {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		double cArea = c1.area(5.5);
		System.out.printf("Area of the Circle : " + "%.2f", cArea);
		double rArea = r1.area(9.4, 12.5);
		System.out.printf("\nArea of the Rectangle : " + "%.2f", rArea);

	}

}
