package com.languagefundamentals;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class PreDefinedObjctDT {

	BigInteger b1;
	BigInteger b2;

	void add(PreDefinedObjctDT pd, PreDefinedObjctDT pd1, BigInteger b1, BigInteger b2) {
		pd.b1 = b1;
		pd1.b1 = b2;
		BigInteger result = pd.b1.add(pd1.b1);
		System.out.println("Addition : " + result);
	}

	void sub(PreDefinedObjctDT pd, PreDefinedObjctDT pd1, BigInteger b1, BigInteger b2) {
		pd.b1 = b1;
		pd1.b1 = b2;
		BigInteger result = pd.b1.subtract(pd1.b1);
		System.out.println("Subtract : " + result);
	}

	void mul(PreDefinedObjctDT pd, PreDefinedObjctDT pd1, BigInteger b1, BigInteger b2) {
		pd.b1 = b1;
		pd1.b1 = b2;
		BigInteger result = pd.b1.multiply(pd1.b1);
		System.out.println("Multiply : " + result);
	}

	void div(PreDefinedObjctDT pd,PreDefinedObjctDT pd1, BigInteger b1, BigInteger b2) {
		pd.b1 = b1;
		pd1.b1 = b2;
		BigInteger result = pd.b1.divide(pd1.b1);
		System.out.println("Division : " + result);
	}

	public static void main(String[] args) {

		PreDefinedObjctDT pd = new PreDefinedObjctDT();
		PreDefinedObjctDT pd1 = new PreDefinedObjctDT();
		System.out.print("Enter a big integer value :");
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		System.out.print("Enter another big integer value :");
		BigInteger b = sc.nextBigInteger();

		pd.add(pd, pd1, a, b);
		pd.sub(pd, pd1, a, b);
		pd.mul(pd, pd1, a, b);
		pd.div(pd, pd1, a, b);

	}

}
