package com.oparators;

public class Swap {

	public static void main(String[] args) {
		int a=265;
		int b=289;
		System.out.println("Before Swapping");
		System.out.println("a:"+a+" "+"b:"+b);
		
		int c=a^b;
		
		a=a^c;
		b=b^c;
		System.out.println("After Swapping");
		System.out.println("a:"+a+" "+"b:"+b);
	}

}
