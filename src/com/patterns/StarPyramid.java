package com.patterns;

public class StarPyramid {

	public static void main(String[] args) {
		int n=5;
		int stars=1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++) {
				System.out.print("*");
			}
			System.out.println();
			stars+=2;
		}
	}

}
