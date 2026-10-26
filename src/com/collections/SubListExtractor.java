package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubListExtractor {
	static void extract(List<Character> charList) {
		List<Character> subCharList = charList.subList(3, 7);
		System.out.print("Sub List : ");
		System.out.println(subCharList);
		subCharList.set(0, 'Z');
		System.out.print("Sub List After modification : ");
		System.out.println(subCharList);
		System.out.print("Original List After modification : ");
		System.out.println(charList);
	}

	public static void main(String[] args) {
		List<Character> charList = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'));
		System.out.print("Original list : ");
		System.out.println(charList);
		extract(charList);
	}

}
