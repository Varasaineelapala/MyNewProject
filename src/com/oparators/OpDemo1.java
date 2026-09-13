package com.oparators;

public class OpDemo1 {
	public static void main(String [] args) {
		int a=10;
		int b=15;
		int c=18;
		int x =++a+--a-a++-b--+c--+c+++--b+b++;
		int y =c+++--a+--b+--c-++b+a+--c;
		System.out.println(x);
		System.out.println(y);
	}

}
