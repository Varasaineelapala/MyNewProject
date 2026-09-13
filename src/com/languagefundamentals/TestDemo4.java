package com.languagefundamentals;

import java.util.Scanner;

public class TestDemo4 {
	int squareNumber(int a) {
		return a*a;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number :");
		int b=sc.nextInt();
		TestDemo4 td=new TestDemo4();
		int a= td.squareNumber(b);
		System.out.print("Square of b : "+a);
		sc.close();
	}

}
