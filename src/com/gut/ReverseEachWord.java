package com.gut;

public class ReverseEachWord {
	static void rev(String str) {
		String str2 = "";
		int n = str.length();
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == ' ') {
				for (int k = i - 1; k >= j; k--) {
					str2 = str2 + str.charAt(k);
				}
				j = i + 1;
				str2 += " ";
			} else if (i == n - 1) {
				for (int k = i; k >= j; k--) {
					str2 = str2 + str.charAt(k);
				}
			}
		}
		System.out.println(str2);

	}

	public static void main(String[] args) {
		String str = "Java Full Stack";
		rev(str);
	}

}
