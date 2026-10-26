package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.List;

public class Swapper {
	static void swap(List<String> colors) {
//		Collections.swap(colors, 1, 4);
		String temp = colors.get(1);
		colors.set(1, colors.get(4));
		colors.set(4, temp);
		System.out.print("After swapping  : ");
		System.out.println(colors);

	}

	public static void main(String[] args) {
		List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));
		System.out.print("Before swapping : ");
		System.out.println(colors);
		swap(colors);
	}

}
