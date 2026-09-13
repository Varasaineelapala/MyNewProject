package com.oops;

public class Customer {

	private int customerId;
	private String name;
	private String email;
	private long phoneNumber;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty()) {
			System.err.println("Name should not be empty...!");
		} else {
			this.name = name;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.contains("@")) {

			this.email = email;
		} else {
			System.err.println("Please enter a valid email...!");
		}
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		if (String.valueOf(phoneNumber).length() == 10) {
			this.phoneNumber = phoneNumber;
		} else {
			System.err.println("Pleace enter a valid Number...!");
		}

	}

	
}
