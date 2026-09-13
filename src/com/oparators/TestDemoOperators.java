package com.oparators;

public class TestDemoOperators {
	int a;

	public static void main(String[] args) {
		int a = 123;
		int b =100;
		int c=90;
		System.out.println(a + " Is Between 100 and 999 :" + (a < 999 && a > 100));
		
		System.out.println(a+" Multiplied by 2   : "+(a << 1));
		System.out.println(a+" Divided by 2      : "+(a >> 1));
		
		System.out.println("Smallest among  three numbers : " +((c<((a<b)? a : b)) ? c : (a<b)? a : b));
		
		System.out.println(b+" is "+((b%2==0) ? "Even" : "Odd"));
		
		
		
		
		

	}

}
