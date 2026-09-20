package com.gut;

import java.util.Arrays;

public class ZeroesToEnd {
	static void moveZeroes(int[] arr) {
		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int []arr= {0,4,6,0,0,2,3,0};
		moveZeroes(arr);
	}

}
