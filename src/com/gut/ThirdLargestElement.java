package com.gut;

public class ThirdLargestElement {
	static void findThirdLarge(int[] arr) {
		if (arr.length < 3 || arr == null) {
			System.out.println("Invlid array..!");
			return;
		}
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				thirdMax = secondMax;
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] < max) {
				thirdMax = secondMax;
				secondMax = arr[i];
			} else if (arr[i] > thirdMax && arr[i] < secondMax) {
				thirdMax = arr[i];
			}
		}
		System.out.println(thirdMax);
	}

	public static void main(String[] args) {
		int[] arr = { 9, 8, 8, 8, 9, 6, 5, 6, 7, 4, 8 };
		findThirdLarge(arr);
	}

}
