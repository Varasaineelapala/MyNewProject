package com.gut;

import java.util.HashMap;

public class TargetPairSumUsingHashMap {

	static void find(int[] arr, HashMap<Integer, Integer> hashMap, int t) {
		int complement = 0;
		for (int n : arr) {
			complement = t - n;
			if (hashMap.containsKey(complement)) {
				int count = hashMap.get(complement);
				for (int i = 0; i < count; i++) {
					System.out.println("(" + n + "," + complement + ")");
				}
			}
			hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
		}
	}
	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int[] arr = { 1, 5, 7, -1, 5 };
		int t = 6;
		find(arr, hashMap, t);
	}

}
