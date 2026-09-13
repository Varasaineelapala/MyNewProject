package com.sorts;

public class Selection {
	int indx;
	int[] arr = { 2, 4, 7, 5, 9, 3, 6, 1 };

	void selection() {
		for (int i = 0; i < arr.length - 1; i++) {
			indx = i;

			for (int j = i; j < arr.length; j++) {
				if (arr[indx] > arr[j]) {
					indx = j;
				}			
			}
			int temp=arr[i];
			arr[i]=arr[indx];
			arr[indx]=temp;
		}
	}
	void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Selection s=new Selection();
		s.selection();
		s.display();

	}

}
