package com.languagefundamentals;

public class Book {
	int bookId;
	String title;
	String author;
	Book(int bookId,String title,String author){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
	Book(Book bk){
		this.bookId=bk.bookId;
		this.title=bk.title;
		
		this.author=bk.author;
	}
	void display() {
		System.out.println("==========================");
		System.out.println("Book ID    : "+bookId);
		System.out.println("Book Title : "+title);
		System.out.println("Author     : "+author);
	}

	public static void main(String[] args) {
		Book bk1=new Book(101,"The Hobbit","J.J.R");
		bk1.display();
		Book bk2= new Book(bk1);
		bk2.bookId=102;
		bk2.title="the lord of the rings";
		bk2.display();
	}

}
