package com.sorts;

public class QuickSort {
	int arr[] = { 10, 80, 30, 90, 40 };

	int partition(int[] arr, int low, int high) {
		int i = low - 1;
		int pivote = arr[high];
		for (int j = low; j < high; j++) {
			if (arr[j] < pivote) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	void quick(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quick(arr, low, pi - 1);
			quick(arr, pi + 1, high);
		}
	}

	void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		qs.quick(qs.arr, 0, qs.arr.length - 1);
		qs.display();

	}

}
