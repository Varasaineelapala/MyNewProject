package com.poc;

public class Book {
	private String bookId;
	private String bookTitle;
	private String author;
	private double price;
	private String year;

	Book(String bookId, String bookTitle, String author, double price, String year) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.author = author;
		this.price = price;
		this.year = year;
	}

	Book() {

	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book Id : " + bookId + "\nTitle : " + bookTitle + "\nAuthor : " + author + "\nPrice : " + price
				+ "/nyear : " + year;
	}

}
