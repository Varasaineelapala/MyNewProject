package com.gut;

public class LongestPrefix {
	static void findLongestFrefix(String[] arr) {
		int n = arr.length;
		int n1 = Integer.MAX_VALUE;
		String pre = "";
		String str = arr[0];
		boolean flag = true;
		// To find the length of the smallest string in the array
		for (int i = 0; i < n; i++) {
			if (n1 > arr[i].length()) {
				n1 = arr[i].length();
			}
		}
		// To iteratively compare each character of the same index in every string of the
		// array of strings with the character of the str
		for (int j = 0; j < n1; j++) {
			for (int k = 0; k < n; k++) {
				if (str.charAt(j) != arr[k].charAt(j)) {
					flag = false;
					break;// if these characters are not equal then flag becomes false and Inner loop breaks
				}
			}
			if (flag) { // if the flag is true then the current character of the str is appended to the pre
						// else  the outer loop breaks and prints the string in the pre.
				pre += str.charAt(j);
			} else {
				break;
			}

		}
		System.out.println(pre);
	}

	public static void main(String[] args) {
		String[] arr = { "prefix", "prevent", "prepare" };
		findLongestFrefix(arr);
	}

}
