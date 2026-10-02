package com.gut;

public class AnagramStrings {
	static boolean isAngram(String str1, String str2) {
		int n = str1.length();
		if (str1.length() != str2.length()) {
			System.out.println("Invalid strings..!");
			return false;
		}
		for (int i = 0; i < n; i++) {
			int count1 = 0;
			int count2 = 0;
			for (int j = 0; j < n; j++) {
				if (str1.charAt(i) == str1.charAt(j)) {
					count1++;
				}
			}
			for (int k = 0; k < n; k++) {
				if (str1.charAt(i) == str2.charAt(k)) {
					count2++;
				}
			}
			if (count1 != count2) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		boolean boo = isAngram(str1, str2);
		if (boo) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Aangrams");
		}
	}

}
