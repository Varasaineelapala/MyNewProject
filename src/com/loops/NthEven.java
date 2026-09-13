package com.loops;

import java.util.Scanner;

public class NthEven {
	static Scanner sc = new Scanner(System.in);
	static int counter;
	int n;

	void even() {
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				if (counter == (n - 1)) {
					System.out.print(n + "th even number under 100 : " + i);

				}
				counter++;
			}
		}
	}

	public static void main(String[] args) {
		NthEven ne = new NthEven();
		System.out.println("enter value of n");
		ne.n = sc.nextInt();
		ne.even();

	}

}
