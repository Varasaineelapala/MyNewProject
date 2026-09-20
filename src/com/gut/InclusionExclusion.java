package com.gut;

public class InclusionExclusion {
	static void find(int arr[][]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				if (arr[i][0] < arr[j][0] && arr[i][1] > arr[j][1]) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				if (arr[i][0] > arr[j][0] && arr[i][1] < arr[j][1]) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.print(+1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2 }, { 2, 10 }, { 3, 9 }, { 5, 8 } };
		find(arr);
	}

}
