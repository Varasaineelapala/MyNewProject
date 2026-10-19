package com.poc;

public interface Loan {
	boolean isPhoneValid();

	boolean isAadharValid();

	boolean isPanValid();

	double getRateOfInterest(int cibilScore);

	int getCibilScore();

	int getCustomerAge();

	double getCustomerSalary();

}
