
package com.patterns;

public class ConcentricNumberSquare {

	public static void main(String[] args) {
		int n = 4;
		int tr = n * 2 - 1;
		for (int i = 1; i <= tr; i++) {
			int val = n;
			for (int j = 1; j <= tr; j++) {
				if (i <= n) {
					if (j < i) {
						System.out.print(val + " ");
						val--;
					} else if (j <= tr - i) {
						System.out.print(val + " ");

					} else {
						System.out.print(val + " ");
						val++;
					}
				} else {
					if (j <= tr - i) {
						System.out.print(val + " ");
						val--;
					} else if (j >= i) {
						System.out.print(val + " ");
						val++;
					} else {
						System.out.print(val + " ");
					}
				}
			}
			System.out.println();

		}
//	************* simpler version ***************
		for (int i = 0; i < tr; i++) {
			for (int j = 0; j < tr; j++) {
				int min = Math.min(Math.min(i, j), Math.min(tr-1 - i, tr-1 - j));
				System.out.print(n - min + " ");
			}
			System.out.println();
		}

	}
}
