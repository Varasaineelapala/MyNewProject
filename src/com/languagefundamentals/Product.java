package com.languagefundamentals;

public class Product {
	int productId;
	String productName;
	int price;

	Product(int pid, String pname, int pri) {
		productId = pid;
		productName = pname;
		price = pri;
	}

	void display() {
		System.out.println("Product Id     : " + productId);
		System.out.println("Product Name   : " + productName);
		System.out.println("Product  Price : " + price);
	}

	public static void main(String[] args) {
		Product p1 = new Product(101, "samsung", 23000);
		p1.display();

	}

}
