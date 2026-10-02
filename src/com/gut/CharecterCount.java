package com.gut;

public class CharecterCount {
	static void count(String str, char ch) {
		int n = str.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(ch + " -> " + count);
	}

	public static void main(String[] args) {
		String str = "banana";
		count(str, 'a');
	}

}
