package com.oparators;

import java.util.Scanner;

public class OnlineExam {
	static Scanner sc = new Scanner(System.in);
	int ans;
	static int n;
	int att;
	int marks;
	double percentage;

	void input() {

		System.out.print("Question " + ++n + " : ");
		ans = sc.nextInt();
		if (ans <= 1 && ans >= -1) {
			calculate(ans);
		} else {
			System.out.println("Invalid input please try again with a valid input...!");
			n--;
			input();
		}
	}

	void calculate(int answer) {

		if (answer == 1) {
			marks++;
			att++;
		} else if (answer == 0) {
			att++;
		}
	}

	void percentage() {
		percentage = ((double) marks / 20) * 100;
	}

	void display() {
		System.out.println("===================================");
		System.out.println("Marks : " + marks);
		System.out.println("Total number of Question attempted : " + att);
		System.out.println("Number of questions not attempted  : " + (20 - att));
		System.out.println("Percentage : " + percentage);
	}

	public static void main(String[] args) {
		OnlineExam oe = new OnlineExam();
		System.out.println("Enter  1 for correct answer");
		System.out.println("Enter  0 for incorrect answer");
		System.out.println("Enter -1 for skipped question");
		System.out.println("------------------------------------");
		int num = 0;
		while (num < 20) {
			oe.input();
			num++;
		}
		oe.percentage();
		oe.display();

	}

}
