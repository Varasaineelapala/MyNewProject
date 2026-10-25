package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeDuplicator {
	static void remove(List<String> fruites) {
		List<String> uniqueFruites = new ArrayList<>();
		for (String fruite : fruites) {
			if (!uniqueFruites.contains(fruite)) {
				uniqueFruites.add(fruite);
			}
		}
		System.out.print("Unique Fruites : ");
		System.out.println(uniqueFruites);

	}

	public static void main(String[] args) {
		List<String> fruites = new ArrayList<>(Arrays.asList("Apple", "Banana", "Apple", "Cherry", "Banana", "Date"));
		remove(fruites);
	}

}
