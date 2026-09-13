package com.twopointerarray;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
	static void moveZeroes(int[] arr ) {
		int i=0;
		System.out.println("Array Before moving Zeroes to the End : "+(Arrays.toString(arr)));
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=0) {	
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}
		System.out.print("Array after moving Zeroes : ");
		for(int k=0;k<arr.length;k++) {	
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
		moveZeroes(arr);
		sc.close();
	}

}
