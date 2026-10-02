package com.gut;

public class SubStringWithEqual01s {
	static int find(String str) {
		int totalCount = 0;
		int preLength = 0;
		int curLength = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				curLength++;
			} else {
				totalCount += Math.min(curLength, preLength);
				preLength = curLength;
				curLength = 1;
			}
		}
		totalCount += Math.min(curLength, preLength);
		return totalCount;
	}

	public static void main(String[] args) {
		String str = "00110011";
		System.out.println(find(str));
	}

}
