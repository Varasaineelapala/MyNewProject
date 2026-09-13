package com.languagefundamentals;

public class SmartPhone {
	int productId;
	String productName;
	String productBrand;
	double price;
	int warranty;

	SmartPhone(int productId, String productName, String productBrand, double price, int warranty) {
		this.productId = productId;
		this.productName = productName;
		this.productBrand = productBrand;
		this.price = price;
		this.warranty = warranty;
	}

	SmartPhone(SmartPhone sp, int productId) {
		this.productId = productId;
		this.productName = sp.productName;
		this.productBrand = sp.productBrand;
		this.price = sp.price;
		this.warranty = sp.warranty;
	}

	void display() {
		System.out.println("Product ID    : " + productId);
		System.out.println("Product Name  : " + productName);
		System.out.println("Product Brand : " + productBrand);
		System.out.println("Product Price : " + price);
		System.out.println("Warranty      : " + warranty +" years");
		System.out.println("=============================");
	}

	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone(101, "S24 Ultra", "Samsung", 120000, 4);
		sp1.display();
		
		SmartPhone sp2=new SmartPhone(sp1,201);
		sp2.display();
		
		
		
	}

}
