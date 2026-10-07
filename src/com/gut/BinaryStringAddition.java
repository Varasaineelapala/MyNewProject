package com.gut;

public class BinaryStringAddition {

	static void add(String a, String b) {
		String res = "";
		int j = a.length() - 1;
		int k = b.length() - 1;
		int size = Integer.max(a.length(), b.length());
		int i = size - 1;
		int carry = 0;
		while (i >= 0) {
			int sum = carry;
			if (j >= 0) {
				sum += a.charAt(j) - '0';
				j--;
			}
			if (k >= 0) {
				sum += b.charAt(k) - '0';
				k--;
			}
			carry = sum / 2;
			res = sum % 2 + res;
			i--;
		}
		if (carry != 0) {
			res = carry + res;
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		String a = "11110100";
		String b = "1011010";
		add(a, b);
	}

}
