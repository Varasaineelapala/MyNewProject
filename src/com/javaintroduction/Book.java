/*Problem 1: The Inventory Management System (Focus: Object Arrays & Scanner)
Scenario: A local bookstore needs to track its current inventory.

Task: Create a Book class with fields for bookId (int), title 
(String), author (String), and price (double).

Requirements:

Inside main, declare an array to store exactly 3 Book objects.

Use a Scanner and a for loop to gather the book data from the
 keyboard. Watch out for the nextInt/nextDouble to nextLine buffer issue!

Instantiate each Book using a constructor inside the loop and
 assign it to the array.

Print the details of all books using an enhanced for-each loop,
 but only if the book's price is greater than 500.*/

package com.javaintroduction;

import java.util.Scanner;

public class Book {
	int bookId;
	String bookName;
	String author;
	double price;

	Book(int bookId, String bookName, String author, double price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	void display() {
		 {
			System.out.println("=========================");
			System.out.println("Book Id :" + bookId);
			System.out.println("Book Name :" + bookName);
			System.out.println("Author :" + author);
			System.out.println("Price :" + price);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] book = new Book[3];
		for (int i = 0; i <= 2; i++) {
			System.out.println("Enter the details of Book " + (i + 1));
			System.out.print("Enter the Book ID :");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Book Name :");
			String name = sc.nextLine();
			System.out.print("Author Name :");
			String author = sc.nextLine();
			System.out.print("Enter Price :");
			double pri = sc.nextDouble();
			sc.nextLine();
			book[i] = new Book(id, name, author, pri);

		}
		sc.close();
		for (Book bk : book) {
			if (bk.price >= 500)
				
			bk.display();
		}
	}

}
