package com.loops;

import java.util.Scanner;

public class ThirdFactor {
	static Scanner sc = new Scanner(System.in);
	static int counter = 1;
	int n;

	void factor(int n) {
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				if (counter == 3) {
					System.out.print("3rd factor of "+n+" is "+i);
				}
				counter++;
			}
		}
	}

	public static void main(String[] args) {
		ThirdFactor tf = new ThirdFactor();
		System.out.print("Enter a number:");
		tf.n = sc.nextInt();
		tf.factor(tf.n);
	}

}
