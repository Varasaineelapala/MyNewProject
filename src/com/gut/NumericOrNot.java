package com.gut;

public class NumericOrNot {
	static boolean isAllNumeric(String num) {
		int n = num.length();
		for (int i = 0; i < n; i++) {
			if (num.charAt(i) - '0' < 0 || num.charAt(i) - '0' > 9) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String num = "12645";
		System.out.println(isAllNumeric(num));
	}

}
