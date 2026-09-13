package com.oparators;

public class Time {

	public static void main(String[] args) {
		int s=399909;
		int sec = s % 60;
		int min = (s/60)%60;
		int hours = (s/3600)%24;
		int days =(s/3600)/24;
		
		System.out.println(days+" Days "+hours+" Hours "+min+" Minutes "+sec+" Seconds");
	}

}
