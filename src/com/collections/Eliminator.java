package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Eliminator {
	static void eliminate(List<Integer> numbers) {
		Iterator<Integer> itr = numbers.iterator();
		while (itr.hasNext()) {
			Integer num = itr.next();
			if (num > 40 || num % 2 == 1) {
//	itr removes the element from the list and shifts one step backward to prevent ConcurrentModificationException
//	itr does not store values it points the list elements 
				itr.remove();
			}
		}
		System.out.println(numbers);
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(12, 5, 45, 18, 33, 24, 7, 50));
		eliminate(numbers);
	}

}
