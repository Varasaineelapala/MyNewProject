package com.Arrays.java;

public class InsertAtPosition {
	int arr[]= {1,2,3,5,6,7,8,4};
	int n= arr.length;
	int pos=7;
	int in=3;
	
	void insert() {
		int p=arr[pos];
		for (int i=pos;i>=in ; i--) {
			arr[i]=arr[i-1];
			
		}
		arr[in]=p;
	}
	void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			
		}
	}
	public static void main(String[] args) {
		InsertAtPosition iap=new InsertAtPosition();
		iap.insert();
		iap.display();

	}

}
