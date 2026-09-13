package com.languagefundamentals;

import java.util.Scanner;

public class StudentResultAnalyzer {
	 int calculteTotal(int m1,int m2,int m3,int m4,int m5) {
		int total=m1+m2+m3+m4+m5;
		return total;
	}
	double calculatePercentage(double total) {
		double percent=total/500*100;
		return percent;
	}
	double calculateAverage(double percent) {
		double average=(percent/10);
		return average;
	}
	
	public static void main(String[] args) {
		StudentResultAnalyzer sra=new StudentResultAnalyzer();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your marks in subject 1 : ");
		int m1=sc.nextInt();
		System.out.print("Enter your marks in subject 2 : ");
		int m2=sc.nextInt();
		System.out.print("Enter your marks in subject 3 : ");
		int m3=sc.nextInt();
		System.out.print("Enter your marks in subject 4 : ");
		int m4=sc.nextInt();
		System.out.print("Enter your marks in subject 5 : ");
		int m5=sc.nextInt();
		int total=sra.calculteTotal(m1,m2,m3,m4,m5);
		System.out.println("Total Marks         : "+total);
		double percentage=sra.calculatePercentage(total);
		System.out.printf("Percentage          : "+"%.2f",percentage);
		System.out.println();
		double average=sra.calculateAverage(percentage);
		System.out.printf("Grade Point Average : "+"%.1f",average);
		sc.close();
		
	}

}
