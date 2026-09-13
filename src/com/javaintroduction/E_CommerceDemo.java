package com.javaintroduction;

public class E_CommerceDemo {

	public static void main(String[] args) {
		int arr[] = { 7, 6, 5, 4, 3, 2, 1 };
		int bp = arr[0];
		int sp = 0;
		int curProfit = 0;
		int maxProfit = 0;
		for (int i = 1; i < arr.length; i++) {
			sp = arr[i];
			curProfit = sp - bp;
			if (curProfit > maxProfit) {
				maxProfit = curProfit;
			}
			if (sp < bp) {
				bp = arr[i];
			}
		}
		System.out.println(maxProfit);

	}

}
