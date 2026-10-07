package com.gut;

public class DuplicateCharecters {
	static void findDuplicates(String str) {
		int n = str.length();
		char duplicateChar = ' ';
		boolean boo[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			if (boo[i] == true) {
				continue;
			}
			for (int j = i + 1; j < n; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					flag = true;
					boo[j] = true;
					duplicateChar = str.charAt(i);
				}
			}
			if (flag) {
				System.out.println(duplicateChar);
			}
		}
	}

	public static void main(String[] args) {
		String str = "Programming";
		findDuplicates(str);
	}

}
