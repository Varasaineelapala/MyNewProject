package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class LargestAndSecondLarge {
	static void find(ArrayList<Integer> numbers) {
		int max = Integer.MIN_VALUE;
		int nextMax = Integer.MIN_VALUE;
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			int num = it.next();
			if (num > max) {
				nextMax = max;
				max = num;
			} else if (num < max && num > nextMax) {
				nextMax = num;
			}
		}
		System.out.println("Maximum value : " + max);
		System.out.println("Next Maximum Value : " + nextMax);
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 35, 60, 90, 55, 65, 45));
		find(numbers);

	}

}
