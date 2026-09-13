package com.loops;

import java.util.Scanner;

public class SpyNumber {
	static boolean spy(int n) {
		int sum = 0;
		int pro = 1;
		while (n > 0) {
			int dig = n % 10;
			sum = sum + dig;
			pro = pro * dig;
			n /= 10;
		}
		if (sum == pro) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int num=sc.nextInt();
		boolean status = spy(num);
		if (status) {
			System.out.println("Is Spy Number ");
		} else {
			System.out.println("Is not a Spy Number ");
		}
		sc.close();
	}



}
