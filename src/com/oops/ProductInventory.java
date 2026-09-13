package com.oops;

public class ProductInventory {

	private int productId;
	private String productName;
	private int quantity;
	private double price;

	public ProductInventory(int productId, String productName, int quantity, double price) {
		setProductId(productId);
		setProductName(productName);
		setQuantity(quantity);
		setPrice(price);
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			System.out.println("Quantity should not be negative...!");
		} else {
			this.quantity = quantity;
		}
	}

	public double getPrice() {
		return price;
	}
	

	public void setPrice(double price) {
		if (price <= 0) {
			System.out.println("Price should not be negative...!");
		} else {
			this.price = price;
		}
	}
}
