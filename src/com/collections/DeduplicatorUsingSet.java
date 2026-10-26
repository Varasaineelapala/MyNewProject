package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DeduplicatorUsingSet {
	static void removeDuplicates(List<Integer> numbers) {
		Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
		System.out.println(uniqueNumbers);
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 10, 5, 20, 10, 30, 5, 40));
		removeDuplicates(numbers);
	}

}
