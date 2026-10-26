package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergerAndSearcher {
	static void merge(List<String> list1, List<String> list2) {
		list1.addAll(list2);
		System.out.println(list1);
		System.out.println("First occurence of \"Java\" : " + list1.indexOf("Java"));
		System.out.println("Last occurence of \"Java\" : " + list1.lastIndexOf("Java"));
	}

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(Arrays.asList("Python", "Java", "C++"));
		List<String> list2 = new ArrayList<>(Arrays.asList("JavaScript", "Java", "Go"));
		merge(list1, list2);

	}

}
