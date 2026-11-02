package com.gut;

import java.util.HashSet;

public class LengthOfLongestConsecutive {
	static void find(int[] arr, HashSet<Integer> hs) {
		int startingElement = 0;
		int maxLength = 0;
//		determining the starting element of the consecutive elements 
//		by iterating through array and checking if there is any arr[i]-1 in hash set
		for (int i = 0; i < arr.length; i++) {

//		if arr[i]-1 exist in the hash set we skip that element 
//		because this means arr[i] is not the starting element but part of the consecutive elements
			if (hs.contains(arr[i] - 1)) {
				continue;
			} else {
//		else the arr[i] is the starting element of the consecutive elements
				startingElement = arr[i];
			}

			int curLength = 0;
//		while there exist element + 1 in hash set we increment the curLength to find the length of the consecutive elements
			while (hs.contains(startingElement + curLength)) {
				curLength++;
				maxLength = Math.max(maxLength, curLength);

			}
		}
		System.out.println(maxLength);
	}

	public static void main(String[] args) {
		int[] arr = { 100, 300, 200 };
		HashSet<Integer> hs = new HashSet<>();
//		storing the array elements into the hash set for eliminating the duplicate elements 
		for (int n : arr) {
			hs.add(n);
		}
		find(arr, hs);
	}
}