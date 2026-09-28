package com.gut;

public class RemoveDuplicateChars {
	static void remove(String str1) {
		int n = str1.length();
		String str2 = "";
		boolean boo[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (boo[i] == true) {
				continue;
			} else {
				str2 = str2 + str1.charAt(i);
			}
			for (int j = i + 1; j < n; j++) {

				if (str1.charAt(i) == str1.charAt(j)) {
					boo[j] = true;
				}
			}
		}
		System.out.println("Original String : " + str1);
		System.out.println("After removing duplicates : " + str2);
	}

	public static void main(String[] args) {
		String str = "programming";
		remove(str);
	}

}
