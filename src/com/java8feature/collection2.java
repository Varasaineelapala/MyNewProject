package com.java8feature;

import java.sql.Time;
import java.util.Date;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class collection2 {


	public static void main(String[] args) {
    Predicate <Integer> p1=(s) -> s>18;
    System.out.println(p1.test(22));
    Predicate <String> p2 =(a) -> a.contains("a");
    System.out.println(p2.test("sunil"));
   
    Predicate <Double> p3 = b-> b>10000.00;
    System.out.println(p3.test(300000.00));
    
    Function <Integer,Integer> p4 =a ->a*a;
    System.out.println(p4.apply(24));
     
    Function <Double,Double> p5=a->a*0.5*0.3;
    System.out.println(p5.apply(24.0));
    
    Supplier <Date> p6 =()->new Date();
    System.out.println(p6.get());
    
    Supplier <Time> p7 =()->new Time(0);
    System.out.println(p7.get());
    
	}

}
