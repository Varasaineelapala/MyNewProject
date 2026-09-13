package com.oops;

class PizzaOrder implements FoodOrder {

	double itemPrice = 239;
	double deliveryCharge = 50;
	double totalBill;

	@Override
	public void calculateBill() {
		totalBill = itemPrice + deliveryCharge;
		System.out.println("-------------------------");
		System.out.println("Total Bill Amount : " + totalBill);
		System.out.println("-------------------------");
	}

	@Override
	public void deliveryCharges() {
		System.out.println("==============");
		System.out.println("    Pizza");
		System.out.println("==============");
		System.out.println("Item Price : " + itemPrice);
		System.out.println("Delivery Charges : " + deliveryCharge);

	}

}

class BurgerOrder implements FoodOrder {

	double itemPrice = 159;
	double deliveryCharge = 50;
	double totalBill;

	@Override
	public void calculateBill() {
		totalBill = itemPrice + deliveryCharge;
		System.out.println("-------------------------");
		System.out.println("Total Bill Amount : " + totalBill);
		System.out.println("-------------------------");
	}

	@Override
	public void deliveryCharges() {
		System.out.println("==============");
		System.out.println("    Burger");
		System.out.println("==============");
		System.out.println("Item Price : " + itemPrice);
		System.out.println("Delivery Charges : " + deliveryCharge);

	}

}

class BiryaniOrder implements FoodOrder {

	double itemPrice = 299;
	double deliveryCharge = 40;
	double totalBill;

	@Override
	public void calculateBill() {
		totalBill = itemPrice + deliveryCharge;
		System.out.println("-------------------------");
		System.out.println("Total Bill Amount : " + totalBill);
		System.out.println("-------------------------");
	}

	@Override
	public void deliveryCharges() {
		System.out.println("==============");
		System.out.println("    Biryani");
		System.out.println("==============");
		System.out.println("Item Price : " + itemPrice);
		System.out.println("Delivery Charges : " + deliveryCharge);
	}

}

public class FoodDelivery {
	public static void main(String[] args) {
		FoodOrder pizza = new PizzaOrder();
		pizza.deliveryCharges();
		pizza.calculateBill();
		FoodOrder burger = new BurgerOrder();
		burger.deliveryCharges();
		burger.calculateBill();
		FoodOrder biryani = new BiryaniOrder();
		biryani.deliveryCharges();
		biryani.calculateBill();

	}

}
