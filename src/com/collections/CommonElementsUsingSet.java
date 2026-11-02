package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class CommonElementsUsingSet {
	static void findCommon(int[] arr1, int[] arr2, int[] arr3) {
		Set<Integer> set1 = new TreeSet<>();
		Set<Integer> set2 = new TreeSet<>();
		Set<Integer> set3 = new TreeSet<>();
		for (int i : arr1) {
			set1.add(i);
		}
		for (int i : arr2) {
			set2.add(i);
		}
		for (int i : arr3) {
			set3.add(i);
		}
		set1.retainAll(set2);
		set1.retainAll(set3);
		System.out.println(set1);
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 10 };
		int[] arr2 = { 1, 5, 10 };
		int[] arr3 = { 1, 6, 10 };
		findCommon(arr1, arr2, arr3);
	}

}
