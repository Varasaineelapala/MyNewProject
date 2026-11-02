package com.poc;

public class PersonalLoan extends LoanImpl {

	void getPersonalLoanInfo() {
		System.out.println("All the personal loan doccuments verified successfully...!");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Personal Loan Banking..!");
		PersonalLoan p1 = new PersonalLoan();
		int age = p1.getCustomerAge();
		double salary = p1.getCustomerSalary();
		int cibil = p1.getCibilScore();
		if (age >= 26 && salary >= 900000 && cibil >= 300 && cibil <= 900) {
			System.out.println("Basic Details are valid check for personal Details..!");
			if (p1.isPhoneValid() && p1.isAadharValid() && p1.isPanValid()) {
				System.out.println("Details are good and Loan got Approved !!");
				System.out.println("Your loan rate of interest is " + p1.getRateOfInterest(cibil));
				p1.getPersonalLoanInfo();

			} else {
				System.out.println("Something went Wrong !!");
			}
		} else {
			System.out.println("You are not eligible for personal Loan and your loan got regected !!");
		}

	}

}
