package com.sorts;

public class Bubble {
	int[] arr = { 2, 6, 4, 7, 9, 3, 1 };

	void bubble() {
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1-j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Bubble b = new Bubble();
		b.bubble();
		b.display();

	}

}
