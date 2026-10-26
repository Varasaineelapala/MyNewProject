package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueMerge {

	public static void main(String[] args) {
		Set<String> setA = new HashSet<>(Arrays.asList("Apple", "Banana"));
		Set<String> setB = new HashSet<>(Arrays.asList("Banana", "Cherry", "Date"));
		setA.addAll(setB);
		System.out.println(setA);
	}

}
