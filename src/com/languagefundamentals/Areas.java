package com.languagefundamentals;

import java.util.Scanner;

public class Areas {
	 double getTriangleArea(double b,double h) {
		double tri= (double)1/2 *(b * h);
		 return tri;
	}
	 double getCircleArea(double r) {
			double cir= Math.PI*r*r;
			 return cir;
		}
	 double getRectangleArea(double l,double br) {
			double rec= l*br;
			 return rec;
		}
	 double getSquareArea(double s) {
			double sqr= s*s;
			 return sqr;
	 }

	public static void main(String[] args) {
		Areas ar= new Areas();
		Scanner sc =new Scanner(System.in);
		//Triangle
		System.out.print("Enter the base of the triangle :");
		double b=sc.nextDouble();
		System.out.print("Enter the hight of the triangle :");
		double h=sc.nextDouble();
		double triArea=ar.getTriangleArea(b, h);
		System.out.println("Area of the Triangle : "+triArea);
		System.out.println("=====================================");
		//Circle
		System.out.print("Enter the  of radius the circle :");
		double r=sc.nextDouble();
		double cirArea=ar.getCircleArea(r);
		System.out.println("Area of the Circle : "+cirArea);
		System.out.println("=====================================");
		//Rectangle
		System.out.print("Enter the Length of the Rectangle :");
		double l=sc.nextDouble();
		System.out.print("Enter the breadth of the Rectangle :");
		double br=sc.nextDouble();
		double recArea=ar.getRectangleArea(l, br);
		System.out.println("Area of the Rectangle : "+recArea);
		System.out.println("=====================================");
		//Square
		System.out.print("Enter the  of side the square :");
		double s=sc.nextDouble();
		double sqrArea=ar.getSquareArea(s);
		System.out.println("Area of the Square : "+sqrArea);
		System.out.println("=====================================");
		//Parallelogram
		
	}

}
