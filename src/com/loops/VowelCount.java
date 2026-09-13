package com.loops;

import java.util.Scanner;

	public class VowelCount {
		static int count(String name) {
			name=name.toLowerCase();
			int count=0;
			for(int i=0;i<name.length()-1;i++) {
				if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
					count++;
				}
			}
			return count;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a string : ");
			String name=sc.next();
			int count=count(name);
			System.out.println("Vowel count : "+count);
			
			sc.close();
		}

	}
