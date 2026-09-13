package com.languagefundamentals;

import java.util.Scanner;

public class Methods100 {

	void getName(String fname, String lname) {
		System.out.println("Full Name : " + fname + " " + lname);
	}

	void age(int age) {
		System.out.println("Age :" + age);
	}

	void height(int height) {
		System.out.println("Height :" + height);
	}
	void weight(int weight) {
		System.out.println("Height :" + weight);
	}
	void colour(String colour) {
		System.out.println("Favourite Colour :" + colour);
	}
	void actor(String actor) {
		System.out.println("Favourite actor :"+actor);
	}
	void anime(String anime) {
		System.out.println("Favourite actor :"+anime);
	}
	void fictionalCharector(String fic) {
		System.out.println("Favourite charector :"+fic);
	}
	void add(int a,int b) {
		int sum=a+b;
		System.out.println("Sum : " +sum );
	}
	void sub(int a,int b) {
		int sub=a-b;
		System.out.println("Sub : " + sub );
	}
	void mul(float c,double d ) {
		double mul=c*d;
		System.out.println("multiple : " + mul );
	}
	void div(int e,float f) {
		float div=e/f;
		System.out.println("Division : " + div );
	}
	void mod(int g,int h) {
		int mod=g%h;
		System.out.println("Modulus : " + mod );
	}


	
	public static void main(String[] args) {
		Methods100 m100 = new Methods100();
		Scanner sc = new Scanner(System.in);
		//001
		System.out.print("Enter the first name :");
		String fname = sc.nextLine();
		System.out.print("Enter the last name : ");
		String lname = sc.nextLine();
		m100.getName(fname, lname);
		//002
		System.out.print("Enter your Age : ");
		int age = sc.nextInt();
		m100.age(age);
		//003
		System.out.print("Enter your Height in CM's : ");
		int height = sc.nextInt();
		m100.height(height);
		//004
		System.out.print("Enter your weight : ");
		int weight = sc.nextInt();
		m100.weight(weight);
		sc.nextLine();
		//005
		System.out.print("Enter your favourite colour :");
		String colour=sc.nextLine();
		m100.colour(colour);
		//006
		System.out.print("Enter your favourite actor name :");
		String actor=sc.nextLine();
		m100.actor(actor);
		//007
		System.out.print("Enter your favourite anime :");
		String anime=sc.nextLine();
		m100.anime(anime);
		//008
		System.out.print("Enter you favourite fictional Charector :");
		String fic =sc.nextLine();
		m100.fictionalCharector(fic);
		//009
		System.out.print("Enter a number :");
		int a=sc.nextInt();
		System.out.print("Enter an other number :");
		int b=sc.nextInt();
		sc.nextLine();
		m100.add(a,b);
		//010
		System.out.print("Enter a number :");
		int x=sc.nextInt();
		System.out.print("Enter an other number :");
		int y=sc.nextInt();
		sc.nextLine();
		m100.sub(x,y);
		//011
		System.out.print("Enter a number :");
		float c=sc.nextFloat();
		System.out.print("Enter an other number :");
		double d=sc.nextDouble();
		sc.nextLine();
		m100.mul(c,d);
		//012
		System.out.print("Enter a number :");
		int e=sc.nextInt();
		System.out.print("Enter an other number :");
		float f=sc.nextFloat();
		sc.nextLine();
		m100.div(e,f);
		//013
		System.out.print("Enter a number :");
		int g=sc.nextInt();
		System.out.print("Enter an other number :");
		int h=sc.nextInt();
		sc.nextLine();
		m100.mod(g,h);
		//014
		
		
	}

}
