package com.java8feature;

interface in2{
	public int factor(int n);
	
}

public class feature2 {

	public static void main(String[] args) {
		
		in2 a=(n) -> n*n*n-n*n;
		System.out.println("differance between two numbers is: "+a.factor(23));

	}

}
