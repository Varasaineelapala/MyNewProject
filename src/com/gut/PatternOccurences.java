package com.gut;

public class PatternOccurences {
	static void find(String text, String ptrn) {
		int s = 0;
		int e = ptrn.length() - 1;
		while (e < text.length()) {
			boolean flag = true;
			for (int i = 0; i < ptrn.length(); i++) {
				if (ptrn.charAt(i) != text.charAt(i + s)) {
					flag = false;
					break;
				}
			} 
			if (flag) {
				System.out.print(s + " ");
			}
			s++;
			e++;

		}

	}

	public static void main(String[] args) {
		String text = "AABAABAADAABAABA";
		String ptrn = "AABA";
		find(text, ptrn);
	}

}
