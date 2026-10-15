package com.gut;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElements {
	static void find(Set<Integer> bs, Set<Integer> cs, Set<Integer> hs) {
		hs.retainAll(bs);
		hs.retainAll(cs);
		System.out.println(hs);
	}

	public static void main(String[] args) {
		int[] a = { 1, 4, 10 };
		int[] b = { 1, 5, 10 };
		int[] c = { 1, 2, 10 };
		Set<Integer> hs = new HashSet<>();
		Set<Integer> bs = new HashSet<>();
		Set<Integer> cs = new HashSet<>();
		for (int n : a) {
			hs.add(n);
		}
		for (int n : b) {
			bs.add(n);
		}
		for (int n : c) {
			cs.add(n);
		}
		find(bs, cs, hs);
	}

}
