package com.java8feature;


interface in1{
	public int  cube(int n);

}

public class feature1{

	public static void main(String[] args) {
		
		
	in1 a = (n) ->	n*n*n;
	System.out.println("cube of given number is : "+a.cube(19));
	

	}

}
