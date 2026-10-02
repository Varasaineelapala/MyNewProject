package com.gut;

public class LongestWord {
	static String findLongestWord(String str) {
		String curWord = "";
		String longest = "";
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				curWord = curWord + str.charAt(i);
				if (curWord.length() > longest.length()) {
					longest = curWord;
				}
			} else {
				curWord = "";
				continue;
			}
		}
		return longest;
	}

	public static void main(String[] args) {
		String str = "In Vcube, Java is Simple";
		System.out.println("Longest word :" + findLongestWord(str));

	}

}
