package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Checker {
	static boolean isAllowed(String name, Set<String> bannedNames) {
		if (!bannedNames.contains(name)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Set<String> bannedNames = new HashSet<>(Arrays.asList("admin", "root", "moderator", "guest"));
		String name = "admin";
		System.out.println(isAllowed(name, bannedNames));
	}

}
