package com.languagefundamentals;

public class WrapperObjects {
	String integer = "12345";
	String floatin = "23.65f";
	String bool = "sai";
	char firstLetter = 'V';
	String fullName = "ara Sai";
	String str="123";

	public static void main(String[] args) {
		WrapperObjects wr = new WrapperObjects();
		int num=Integer.parseInt(wr.integer) + 54321;
		System.out.println(num);
		
		float num2=Float.parseFloat(wr.floatin) + 54.98f;
		System.out.println(num2);

		System.out.println(Boolean.parseBoolean(wr.bool));

		System.out.println(Character.toString(wr.firstLetter) + wr.fullName);
		System.out.println(wr.str);
		
		String d="1324.64646d";
		int n=Integer.parseInt(wr.str);
		String ft="235.432f";
		float j=Float.parseFloat(ft);
		double t=Double.parseDouble(d);
		Integer i=12345;
		
		
		System.out.println(j+123);	
		System.out.println(t+123);
		System.out.println(Double.valueOf(123));
		
	}

	
}
