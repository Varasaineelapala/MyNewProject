package com.Arrays.java;

public class DelDuplicates {

	public static void main(String[] args) {
		int i=1;
		int j=0;
		int arr[]= {1,1,2,2,3,4,4,6,7,7,8,9,9,9};
		for(i=0;i<arr.length;i++) {
			if(arr[i]!=arr[j]) {
				j++;
				arr[j]=arr[i];
			}
		}
		System.out.println("New array length "+(j+1));
		for (int k = 0; k <=j; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
