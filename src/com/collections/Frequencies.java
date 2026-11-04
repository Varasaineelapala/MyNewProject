package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Frequencies {
	static void findFrequencies(int[] nums) {
		Map<Integer, Integer> frequencies = new HashMap<>();
		for (int i : nums) {
			frequencies.put(i, frequencies.getOrDefault(i, 0) + 1);
		}
		System.out.println(frequencies);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 1, 4, 3 };
		findFrequencies(nums);
	}

}
