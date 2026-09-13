package com.languagefundamentals;

public class MobileRecharge {
	void showPlanDetails() {
		System.out.println("Plan Name : unlimited 299");
		System.out.println("validity  : 28 days");
		System.out.println("data      : 1.5/day");
		System.out.println("calls     : unlimited");
	}
	void recharge(double amount) {
		System.out.println("Recharge successful ");
		System.out.println("your current recharge plan is :"+ amount);
	}
	public static void main(String[] args) {
     MobileRecharge mr =new MobileRecharge();
     mr.showPlanDetails();
     mr.recharge(299);
	}

}
