package com.gut;

import java.util.HashSet;

public class SubSertOrNot {
	static boolean check(int[] b, HashSet<Integer> hs) {
		for (int i = 0; i < b.length; i++) {
			if (hs.contains(b[i])) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3 };
		HashSet<Integer> hs = new HashSet<>();
		for (int n : a) {
			hs.add(n);
		}
		System.out.println(check(b, hs));

	}

}
