package com.gut;

import java.util.HashSet;

public class FirstRepeatingElement {
	static void find(String str) {
		int n = str.length();

		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = i + 1; j < n; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println(str.charAt(i));
				break;
			}

		}
	}

	// ==================================================
	static void find2(String str) {
		int n = str.length();
		HashSet<Character> c = new HashSet<>();
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if (c.contains(ch)) {
				System.out.println(str.charAt(i));
				break;
			}
			c.add(ch);
		}
	}

	public static void main(String[] args) {
		String str = "programming";
		find(str);
		find2(str);

	}

}
