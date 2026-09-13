package com.languagefundamentals;

public class Books {
	String bookTitle;
	String author;
	int year;
	double price;
	int numberOfPages;
	
	Books(){
		this("Unknown");
		System.out.println("No arg constructor called");
	}
	Books(String bookTitle){
		this(bookTitle,"unknown");
		System.out.println("One arg constructor called");
	}
	Books(String bookTitle,String author){
		this(bookTitle,author,0);
		System.out.println("Two arg constructor called");
	}
	Books(String bookTitle,String author,int year){
		this(bookTitle,author,year,0.0);
		System.out.println("Three arg constructor called");
	}
	Books(String bookTitle,String author,int year ,double price){
		this(bookTitle,author,year,price,0);
		System.out.println("Four arg constructor called");
	}
	void display() {
		System.out.println("=============================================");
		System.out.println("Book Title      : "+bookTitle);
		System.out.println("Book Author     : "+author);
		System.out.println("Published Year  : "+year);
		System.out.println("Book Price      : "+price);
		System.out.println("Number of Pages : "+numberOfPages);
		System.out.println("---------------------------------------------");
	}
	Books(String bookTitle,String author,int year,double price,int numberOfPages){
		this.bookTitle=bookTitle;
		this.author=author;
		this.year=year;
		this.price=price;
		this.numberOfPages=numberOfPages;
		System.out.println("Five arg constructor called");
		
	}
	

	public static void main(String[] args) {
		Books bks1 =new Books();
		bks1.display();
		Books bks2 =new Books("1984");
		bks2.display();
		Books bks3 =new Books("The great gatsby","st.fitzgerald");
		bks3.display();
		Books bks4 =new Books("To kill a mocking bird","Horper lee",1960);
		bks4.display();
		Books bks5 =new Books("Pride and prijudice","jane austen",1813,7.99);
		bks5.display();
		Books bks6 =new Books("The Hobbit","J.R.R. Tolkien",1937,15,310);
		bks6.display();
	}

}
