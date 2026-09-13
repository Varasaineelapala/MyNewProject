package com.javaintroduction;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class WrapperObjects {

	BigInteger b1;
	BigInteger b2;

	void add(WrapperObjects wr, WrapperObjects wr1, BigInteger b1, BigInteger b2) {
		wr.b1 = b1;
		wr1.b1 = b2;
		BigInteger result = wr.b1.add(wr1.b1);
		System.out.println("Addition : " + result);
	}

	void sub(WrapperObjects wr, WrapperObjects wr1, BigInteger b1, BigInteger b2) {
		wr.b1 = b1;
		wr1.b1 = b2;
		BigInteger result = wr.b1.subtract(wr1.b1);
		System.out.println("Subtract : " + result);
	}

	void mul(WrapperObjects wr, WrapperObjects wr1, BigInteger b1, BigInteger b2) {
		wr.b1 = b1;
		wr1.b1 = b2;
		BigInteger result = wr.b1.multiply(wr1.b1);
		System.out.println("Multiply : " + result);
	}

	void div(WrapperObjects wr, WrapperObjects wr1, BigInteger b1, BigInteger b2) {
		wr.b1 = b1;
		wr1.b1 = b2;
		BigInteger result = wr.b1.divide(wr1.b1);
		System.out.println("Division : " + result);
	}

	public static void main(String[] args) {

		WrapperObjects wr = new WrapperObjects();
		WrapperObjects wr1 = new WrapperObjects();
		System.out.print("Enter a big integer value :");
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		System.out.print("Enter another big integer value :");
		BigInteger b = sc.nextBigInteger();

		wr.add(wr, wr1, a, b);
		wr.sub(wr, wr1, a, b);
		wr.mul(wr, wr1, a, b);
		wr.div(wr, wr1, a, b);

	}

}
