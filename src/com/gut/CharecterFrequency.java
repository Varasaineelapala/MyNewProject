package com.gut;

public class CharecterFrequency {
	static void findFrequencies(String str) {
		int n = str.length();
		boolean[] boo = new boolean[n];
		for (int i = 0; i < n; i++) {
			int count = 1;
			if (boo[i] == true) {
				continue;
			}
			for (int j = i + 1; j < n; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					boo[j] = true;
					count++;
				}
			}
			System.out.println(str.charAt(i) + " -> " + count);
		}
	}

	public static void main(String[] args) {
		String str = "banana";
		findFrequencies(str);
	}

}
