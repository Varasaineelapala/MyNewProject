package com.conditionalstatements;

import java.util.Scanner;

public class Shopping {
	static double bill;
	String ch;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Shopping s = new Shopping();
		do {
			System.out.println("vegetables ");
			System.out.println("fruits ");
			System.out.print("Enter your choice :");
			String op=sc.next().toLowerCase();
			switch(op) {
			case "vegetables" ->{
				System.out.println("1 for tomato");
				System.out.println("2 for potato");
				System.out.println("3 for carrot");
				System.out.print("Enter your choice : ");
				int veg=sc.nextInt();
				switch(veg) {
				case 1 -> {
					System.out.println("Kg 50rs");
					System.out.print("Enter the quantity in kgs : ");
					double t=sc.nextDouble();
					bill=bill+(t*50);
				}
				case 2 -> {
					System.out.println("Kg 40rs");
					System.out.print("Enter the quantity in kgs : ");
					double t=sc.nextDouble();
					bill=bill+(t*40);
				}
				case 3 -> {
					System.out.println("Kg 60rs");
					System.out.print("Enter the quantity in kgs : ");
					double t=sc.nextDouble();
					bill=bill+(t*60);
				}
				}
				
				
			}
			case "fruits" ->{
				System.out.println("1 for Apple");
				System.out.println("2 for Banana");
				System.out.println("3 for Papaya");
				System.out.print("Enter your choice : ");
				int fru =sc.nextInt();
				switch(fru) {
				case 1-> {
					System.out.println("Kg 100rs");
					System.out.print("Enter the quantity in kgs : ");
					double t=sc.nextDouble();
					bill=bill+(t*100);
				}
				case 2 -> {
					System.out.println("Kg 70rs");
					System.out.print("Enter the quantity in kgs : ");
					double t=sc.nextDouble();
					bill=bill+(t*40);
				}
				case 3 -> {
					System.out.println("Kg 60rs");
					System.out.print("Enter the quantity in kgs : ");
					double t=sc.nextDouble();
					bill=bill+(t*60);
				}
				}
			}
			}
			System.out.println("---------------------------------------------------------");
			System.out.println("If you want to continue shopping enter Y or N to get bill ");
			s.ch=sc.next();
			System.out.println("---------------------------------------------------------");
		}while(s.ch.equalsIgnoreCase("y"));
		System.out.printf("Your total Bill Amount: Rs."+"%.2f",bill);
	}

}
