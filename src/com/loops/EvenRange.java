package com.loops;

import java.util.Scanner;

public class EvenRange {
	static Scanner sc = new Scanner(System.in);
	int n;

	void even(int n) {
		for (int i = 2; i <= n; i += 2) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		EvenRange er = new EvenRange();

		System.out.print("Enter range :");
		er.n = sc.nextInt();

		er.even(er.n);
	}

}
