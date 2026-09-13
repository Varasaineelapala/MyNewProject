package com.Arrays.java;

import java.util.Scanner;

public class MissingNumber {
	static void check(int[] arr,int n) {
		int sum=0;
		for(int i=0;i<n-1;i++) {
			sum=sum+arr[i];
		}

		int missingNumber=(n*((n+1))/2)-sum ;
		System.out.println(missingNumber);
		System.out.println(n*((n+1))/2);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size if thea array : ");
		int n = sc.nextInt();
		int[] arr = new int[n-1];
		for (int i = 0; i < n-1 ; i++) {
			arr[i] = sc.nextInt();
		}		
		check(arr,n);
		sc.close();

	}

}
