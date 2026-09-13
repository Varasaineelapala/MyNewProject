package com.loops;

import java.util.Scanner;

public class BinToInt {
	static void binToInt(int n) {
		int sum=0;
		int pow=0;
		while (n>0) {
			
			int dig=n%10;
			sum=(int) (sum+dig*(Math.pow(2,pow)));
			pow++;
			n/=10;
		}
		System.out.println("Decimal Number : "+sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Binary Number : ");
		int n=sc.nextInt();	
		binToInt(n);
		sc.close();
	}

}
