package com.collections;

import java.util.Arrays;
import java.util.TreeSet;

public class RangeFinder {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>(Arrays.asList(45, 82, 94, 61, 75, 53, 88, 70));
		System.out.println("Lowest Score : " + scores.first());
		System.out.println("Highest Score : " + scores.last());
		System.out.println("Less than 70 : " + scores.headSet(70));
		System.out.println("greater than or equal to 70 : " + scores.tailSet(70));
		System.out.println("sub set : " + scores.subSet(10,70));
		
	}

}
