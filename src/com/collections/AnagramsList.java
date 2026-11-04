package com.collections;

import java.util.ArrayList;
import java.util.List;

public class AnagramsList {
	static void group(String[] arr) {
		boolean boo[] = new boolean[arr.length];
		List<List<String>> anagrams = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (!boo[i]) {
				ArrayList<String> str = new ArrayList<>();
				for (int j = i; j < arr.length; j++) {
					if (!boo[j]) {
						boolean flag = AnagramOrNot.isAnagram(arr[i], arr[j]);
						if (flag) {
							str.add(arr[j]);
							boo[j] = true;
						}
					}
				}
				anagrams.add(str);
			}

		}
		System.out.println(anagrams);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		String[] arr = { "ate", "eat", "tea", "tab", "bat", "tin" };
		group(arr);
		System.out.println("main method ended");
	}

}
