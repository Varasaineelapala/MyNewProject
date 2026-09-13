package com.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheRandomNum {
	static Scanner sc = new Scanner(System.in);

	static void isSame(int r) {

		int count = 0;

		while (count < 3) {

			System.out.print("Guess the random number : ");
			int n = sc.nextInt();
			if (r == n) {
				System.out.println("You Won..!");
				break;
			} else if (r < n) {
				System.out.println("Too high Try with lesser number ");
			} else {
				System.out.println("Too small Try with larger number ");
			}

			count++;
			if (count == 3) {
				System.out.println("You failed to guess try again...! ");
			}
		}

	}

	public static void main(String[] args) {

		Random rand = new Random();
		System.out.print("Enter the range of the random number : ");
		int r = sc.nextInt();
		int ranNum = rand.nextInt(1, r + 1);
		isSame(ranNum);
		sc.close();

	}

}
