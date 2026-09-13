package com.java8feature;

import java.util.function.Predicate;

public class java8fetur {

	public static void main(String[] args) {
		String [] names= {"sunil","sunilkumar","hassan","uresg","sahdgsydfgw"};
		
		Predicate <String> pa=(s)->s.length()>5;
		Predicate <String> p2=(s)->s.contains("a");
		Predicate <String> p3=pa.and(p2).negate()		;
		
		
		for(String name:names) {
		if(p3.test(name))
		System.out.println(name);
		
		
	}

	}}
