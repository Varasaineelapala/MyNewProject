package com.conditionalstatements;

import java.util.Scanner;

public class Triangle {
	int sideAB;
	int sideBC;
	int sideCA;
	public static void main(String[] args) {
		Triangle t = new Triangle();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the length of AB :");
		t.sideAB=sc.nextInt();
		System.out.print("Enter the length of BC :");
		t.sideBC=sc.nextInt();
		System.out.print("Enter the length of CA :");
		t.sideCA=sc.nextInt();
		
		if((t.sideAB+ t.sideBC)>t.sideCA  && (t.sideAB+ t.sideCA)>t.sideBC  && (t.sideBC+ t.sideCA)>t.sideAB){
			System.out.println("Valied triangle");
		}
		else {
			System.out.println("Not a Valied triangle");
		}
		sc.close();
	}

}
