package com.oops;

import java.util.Scanner;

public class InvertoryManager {
	static Scanner sc = new Scanner(System.in);

	static void add(ProductInventory[] proIn, int n) {
		int i = 0;
		while (n > 0 && i < proIn.length) {
			if (proIn[i] == null) {

				System.out.print("Enter product ID : ");
				int pid = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter product Name : ");
				String pname = sc.nextLine();

				System.out.print("Enter product quantity : ");
				int pq = sc.nextInt();

				System.out.print("Enter product Price : ");
				double pp = sc.nextDouble();
				proIn[i] = new ProductInventory(pid, pname, pq, pp);
				n--;
				System.out.println("=================================");
			}
			i++;
		}
	}

	static void remove(ProductInventory[] proIn, int pid) {
		boolean flag = true;
		for (int i = 0; i < proIn.length; i++) {
			if (proIn[i] != null) {
				if (pid == proIn[i].getProductId()) {
					flag = false;
					proIn[i] = null;
					System.out.println("Product removed from the stock...!");
					System.out.println("=================================");
				}
			}
		}
		if (flag) {
			System.out.println("Product " + pid + " not found in the inventory...!");
		}
	}

	static void checkInventory(ProductInventory[] proIn) {
		boolean flag = false;
		System.out.println("=================================");
		for (ProductInventory pro : proIn) {
			if (pro != null) {
				flag = true;
				System.out.println("Product id       : " + pro.getProductId());
				System.out.println("Product Name     : " + pro.getProductName());
				System.out.println("Product quantity : " + pro.getQuantity());
				System.out.println("Product price    : " + pro.getPrice());
				System.out.println("*********************************");
			}
		}
		if (!flag) {
			System.out.println("Inventory is empty...!");
			System.out.println("---------------------------------");
		}
	}

	public static void main(String[] args) {
		ProductInventory[] proIn = new ProductInventory[10];
		String op = "";
		do {
			System.out.println("\"1\" Check Invertory ");
			System.out.println("\"2\" Add Products to Invertory ");
			System.out.println("\"3\" Remove Product from Invertory ");
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				checkInventory(proIn);
				break;
			}
			case 2: {
				System.out.print("Enter the number of products you want to add : ");
				int num = sc.nextInt();
				System.out.println("---------------------------------");
				add(proIn, num);

				break;
			}
			case 3: {
				System.out.print("Enter the Product id you want to remove :");
				int pid = sc.nextInt();
				remove(proIn, pid);
				break;
			}
			default:
				System.out.println("Enter a valid option...!");
				break;
			}
			System.out.println("Enter \"Y\" to continue ");
			System.out.println("Enter \"N\" to Exit ");
			op = sc.next();
		} while (op.equalsIgnoreCase("y"));
		System.out.println("Exit...!");
	}
}
