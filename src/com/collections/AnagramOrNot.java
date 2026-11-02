package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class AnagramOrNot {
	static boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() != str2.length()) {
			return false;
		}
		ArrayList<Character> chars1 = new ArrayList<>();
		ArrayList<Character> chars2 = new ArrayList<>();
		for (int i = 0; i < str1.length(); i++) {
			chars1.add(str1.charAt(i));
			chars2.add(str2.charAt(i));
		}
		Collections.sort(chars1);
		Collections.sort(chars2);
		if (chars1.equals(chars2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str1 = "Bat";
		String str2 = "tab";
		boolean boo = isAnagram(str1, str2);
		if (boo) {
			System.out.println("anagram");
		} else {
			System.out.println("Not anagram");
		}

	}

}
