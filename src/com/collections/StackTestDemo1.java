package com.collections;

import java.util.Stack;

public class StackTestDemo1 {

	public static void main(String[] args) {
		Stack<Integer> numbers = new Stack<>();
		numbers.push(10);
		numbers.push(20);
		numbers.push(40);
		numbers.push(70);
		numbers.push(50);
		numbers.push(60);
		System.out.println(numbers.contains(20));
		numbers.remove(numbers.indexOf(20));
		System.out.println(numbers.pop());
		System.out.println(numbers);
	}

}
