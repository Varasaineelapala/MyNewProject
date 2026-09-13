package com.languagefundamentals;

public class Laptop {
	String brand;
	int ram;
	double price;
	
	Laptop(String brand,int ram,double price){
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}
	Laptop(Laptop l){
		this.brand=l.brand;
		this.ram=l.ram;
		this.price=l.price;
	}
void display () {
	System.out.println("Brand :"+brand);
	System.out.println("Ram :"+ram);
	System.out.println("price :"+price);
}
	public static void main(String[] args) {
		Laptop l1=new Laptop("hp",8,50000);
		l1.display();
		
		Laptop l2=new Laptop(l1);
		l2.increasePrice();
		l2.display();
	}
	void increasePrice() {
		price=price+10000;
	}

}
