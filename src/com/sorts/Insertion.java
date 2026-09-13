package com.sorts;

public class Insertion {
	int[] arr = { 4, 3, 6, 8, 4, 6, 8, 2, 1 };
	int n = arr.length;

//	void wrongInsertion() {
//		for (int i = 1; i < n; i++) {
//			int key = arr[i];
//			for (int j = 0; j < i; j++) {
//
//				if (arr[j] >= key) {
//					for (int k = i; k > j; k--) {
//						arr[k] = arr[k - 1];
//					}
//					arr[j] = key;
//					break;
//				}
//
//			}
//		}
//
//	}

	void insertion() {
		
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

	void display() {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Insertion i = new Insertion();
		i.insertion();
		i.display();
	}

}
