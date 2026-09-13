package com.twopointerarray;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	static void remDupli(int[] arr) {
		System.out.println("Array Before Removing Duplicates : "+(Arrays.toString(arr)));
		int i=0;
		for(int j=1;j<=arr.length-1;j++) {
			if(arr[i]!=arr[j]) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.print("Array after Removing Duplicates : ");
		for(int k=0;k<=i;k++) {	
			 System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			
		}
		remDupli(arr);
		sc.close();
	}
	

}
