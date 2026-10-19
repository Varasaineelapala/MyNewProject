package com.poc;

import java.util.Scanner;

public class LoanImpl implements Loan {
	static Scanner sc = new Scanner(System.in);

	@Override
	public boolean isPhoneValid() {
		System.out.println("Enter your Phone Number : ");
		String phoneNumber = sc.next();
		return phoneNumber.matches("[6-9]{1}[0-9]{9}");
	}

	@Override
	public boolean isAadharValid() {
		System.out.println("Enter your Aadhar Number : ");
		String aadharNumber = sc.next();
		return aadharNumber.matches("[1-9]{1}[0-9]{11}");
	}

	@Override
	public boolean isPanValid() {
		System.out.println("Enter your PAN Number : ");
		String aadharNumber = sc.next();
		return aadharNumber.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

	@Override
	public double getRateOfInterest(int cibilScore) {
		double roi = 8.5;
		if (cibilScore >= 300 && cibilScore <= 549) {
			System.out.println("Poor-High Risk..!");
			roi += 4.5;
		} else if (cibilScore >= 550 && cibilScore <= 699) {
			System.out.println("Fair-Moderate Risk..!");
			roi += 2.5;
		} else if (cibilScore >= 700 && cibilScore <= 749) {
			System.out.println("Good-Low Risk...!");
			roi += 1.5;
		} else if (cibilScore >= 750 && cibilScore <= 900) {
			System.out.println("Excellent-verylow Risk..!");
			roi += 0.5;
		} else {
			System.out.println("Invalid Cibil Information Can you contact with you realtionship bank manager");
		}
		return roi;
	}

	@Override
	public int getCibilScore() {
		System.out.println("Enter your CIBIL Score : ");
		int cibilScore = sc.nextInt();
		return cibilScore;
	}

	@Override
	public double getCustomerSalary() {
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	@Override
	public int getCustomerAge() {
		System.out.println("Enter your Age : ");
		int age = sc.nextInt();
		return age;
	}

}
