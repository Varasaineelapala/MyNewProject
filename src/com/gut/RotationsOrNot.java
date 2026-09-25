package com.gut;

public class RotationsOrNot {
	static boolean isRotation(String str1, String str2) {
		int n = str1.length();
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = 0; j < n; j++) {
				if (str1.charAt(j) != str2.charAt((i + j) % n)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return true;
			}
		}
		return false;
	}

	// **************************************************
	static boolean isRotation2(String str1, String str2) {
		String concatenated = str1 + str1;
		return concatenated.contains(str2);
	}
	// **************************************************

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";
		boolean status = isRotation(str1, str2);
		System.out.println(status);
		System.out.println(isRotation2(str1, str2));
	}

}
