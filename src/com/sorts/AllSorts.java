package com.sorts;

import java.util.Scanner;

public class AllSorts {

	int n;
	int[] arr;
	static Scanner sc = new Scanner(System.in);

	// Input method
	void takeInput() {
		System.out.print("Enter the size if the array : ");
		n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the element " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("========================================");
	}

	// *****************Bubble Sort****************//
	void bubble() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	// ***************Selection Sort****************//
	void selection() {

		for (int i = 0; i < n; i++) {
			int minIndx = i;
			for (int j = i; j < n; j++) {
				if (arr[j] < arr[minIndx]) {
					minIndx = j;
				}
			}
			swap(arr, i, minIndx);
		}
	}

	// ***************Insertion Sort****************//
	void insert() {
		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int key = arr[i];
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	// **************Merge Sort*********************//
	void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[left + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[mid + j + 1];
		}
		int i = 0;
		int j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k++] = L[i++];
		}
		while (j < n2) {
			arr[k++] = R[j++];
		}
	}

	void sort(int arr[], int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	// ***************Quick Sort******************//
	int partition(int[] arr, int low, int high) {
		int pivote = arr[high];
		int j = 0;
		int i = low - 1;
		for (j = low; j <= high - 1; j++) {
			if (arr[j] < pivote) {
				i++;
				swap(arr, j, i);
			}

		}

		swap(arr, i + 1, high);
		return i + 1;
	}

	void quick(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quick(arr, low, pi - 1);
			quick(arr, pi + 1, high);

		}
	}

	// Swapping method
	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Display method
	void display() {
		System.out.print("Your sorted array : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		AllSorts as = new AllSorts();
		String c;
		do {
			as.takeInput();
			System.out.println("1 for Bubble Sort ");
			System.out.println("2 for Selection Sort ");
			System.out.println("3 for Insertion Sort ");
			System.out.println("4 for Merge Sort ");
			System.out.println("5 for Quick Sort ");
			System.out.println("----------------------------------------");
			System.out.print("Enter you choice : ");

			int ch = sc.nextInt();
			switch (ch) {
			case 1 -> {
				as.bubble();
				as.display();
			}
			case 2 -> {
				as.selection();
				as.display();
			}
			case 3 -> {
				as.insert();
				as.display();
			}
			case 4 -> {
				as.sort(as.arr, 0, as.arr.length - 1);
				as.display();
			}
			case 5 -> {
				as.quick(as.arr, 0, as.arr.length - 1);
				as.display();
			}
			}
			System.out.println("\n========================================");
			System.out.print("If you want to continue Enter\"Y\" \n Or enter \"N\" to exit :");
			c = sc.next();
		} while (c.equalsIgnoreCase("y"));

	}
}
