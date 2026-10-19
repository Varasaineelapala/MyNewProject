package com.poc;

public class HomeLoan extends LoanImpl {

	void getPersonalLoanInfo() {
		System.out.println("All the Home loan doccuments verified successfully...!");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Home Loan Banking..!");
		PersonalLoan h1 = new PersonalLoan();
		int age = h1.getCustomerAge();
		double salary = h1.getCustomerSalary();
		int cibil = h1.getCibilScore();
		if (age >= 25 && salary >= 600000 && cibil >= 300 && cibil <= 900) {
			System.out.println("Basic Details are valid check for personal Details..!");
			if (h1.isPhoneValid() && h1.isAadharValid() && h1.isPanValid()) {
				System.out.println("Details are good and Loan got Approved !!");
				System.out.println("Your loan rate of interest is " + h1.getRateOfInterest(cibil));
				h1.getPersonalLoanInfo();

			} else {
				System.out.println("Something went Wrong !!");
			}
		} else {
			System.out.println("You are not eligible for Home Loan and your loan got regected !!");
		}

	}

}
