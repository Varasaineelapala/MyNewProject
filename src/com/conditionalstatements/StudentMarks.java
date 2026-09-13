package com.conditionalstatements;

import java.util.Scanner;

public class StudentMarks {
	int tel;
	int eng;
	int math;
	int sci;
	int soc;
	double percentage;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentMarks sm = new StudentMarks();
		System.out.print("Enter marks in Telugu  : ");
		sm.tel = sc.nextInt();

		System.out.print("Enter marks in English : ");
		sm.eng = sc.nextInt();

		System.out.print("Enter marks in Maths   : ");
		sm.math = sc.nextInt();

		System.out.print("Enter marks in Science : ");
		sm.sci = sc.nextInt();

		System.out.print("Enter marks in Social  : ");
		sm.soc = sc.nextInt();

		double total = sm.tel + sm.eng + sm.math + sm.sci + sm.soc;
		sm.percentage = (total / 500) * 100;
		System.out.println("Percentage : " + sm.percentage);

		if (sm.percentage >= 90) {
			System.out.println("Grade : A");
		} else if (sm.percentage >= 75 && sm.percentage < 90) {
			System.out.println("Grade : B");
		} else if (sm.percentage >= 60 && sm.percentage < 75) {
			System.out.println("Grade : C");
		} else if (sm.percentage >= 40 && sm.percentage < 60) {
			System.out.println("Grade : D");
		} else if (sm.percentage < 40) {
			System.out.println("Grade : F");
		}
		sc.close();

	}

}
