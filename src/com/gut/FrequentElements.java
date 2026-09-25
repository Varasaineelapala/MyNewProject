package com.gut;

import java.util.Arrays;

public class FrequentElements {
	static void frequency(int[] arr) {

		int n = arr.length;
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			int count = 1;
			if (visited[i]) {
				continue;
			}
			for (int k = i + 1; k < n; k++) {
				if (arr[i] == arr[k]) {
					visited[k] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " -> " + count);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 1, 4, 2 };
		frequency(arr);
	}

}
