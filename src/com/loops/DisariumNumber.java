package com.loops;

import java.util.Scanner;

public class DisariumNumber {
	static boolean isDisarium(int n) {
		Integer num = n;
		int sum = 0;
//		int count = num.toString().length();
		int count=count(n);
		while (n > 0) {
			int d = n % 10;
			sum = (int) (sum + (Math.pow(d, count)));
			count--;
			n /= 10;
		}
		if (num == sum) {
			return true;
		}
		return false;
	}
	static int count(int n) {
		int count=0;
		while (n>0) {
			n/=10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		boolean status = isDisarium(n);
		if (status) {
			System.out.println("Is a disarium");
		} else {
			System.out.println("Is not a Disarium Number");
		}
		sc.close();
	}

}
