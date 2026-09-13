package com.loops;

public class LCM {

	public static void main(String[] args) {
		int a = 12;
		int b = 18;
		int lcm = a * b;
		for (int i = lcm; i > 1; i--) {
			if (i % a == 0 && i % b == 0) {
				lcm = i;
			}
		}
		System.out.println(lcm);
	}

}
