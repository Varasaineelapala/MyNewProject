package com.gut;

public class UniqueElementInString {
	static void find(String str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				if (str.charAt(i) == str.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}

	public static void main(String[] args) {
		String str = "Vcube Vjava";
		find(str);
	}

}
