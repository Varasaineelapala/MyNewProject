package com.gut;

public class MissingElement {
	static void missingElement(int[] arr) {
		int n = arr.length;
		int n2 = n + 1;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		int me = (n2 * (n2 + 1) / 2) - sum;
		System.out.println("Missing Element : " + me);
	}

//********************************************************
	static void me2(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			if (arr[i] - arr[i - 1] == 2) {
				System.out.println("missing number : " + (arr[i - 1] + 1));
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		missingElement(arr);
		me2(arr);
	}

}
