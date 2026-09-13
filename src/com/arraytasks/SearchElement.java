package com.arraytasks;

import java.util.Scanner;

public class SearchElement {
	
	static void search(int[] arr, int t) {
		boolean boo=false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == t) {
				System.out.println("Element " + t + " found at index " + i);
				boo=true;
			}
		}
		if(!boo) {
			System.out.println("Element Not Found...!");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the target element : ");
		int t=sc.nextInt();
		sc.close();
		search(arr,t);
	}

}
