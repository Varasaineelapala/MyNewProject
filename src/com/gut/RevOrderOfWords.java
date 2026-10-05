package com.gut;

public class RevOrderOfWords {
	static void revWords(String str) {
		String str2 = "";
		String[] words = str.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			str2 += words[i] + " ";
		}
		System.out.println(str2);
	}

	public static void main(String[] args) {
		String str = "Java full Stack";
		revWords(str);
	}

}
