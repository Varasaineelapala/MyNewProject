package com.gut;

public class DuplicateNumber {
	static void duplicateNumber(int[] arr) {
		int n = arr.length - 1;
		int sum = 0;
		int dupliNum = 0;
		for (int i = 0; i <= n; i++) {
			sum += arr[i];
		}
		dupliNum = sum - (n * (n + 1) / 2);
		System.out.println(dupliNum);
	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 2 , 3, 4, 5 };
		duplicateNumber(arr);
	}

}
