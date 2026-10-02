package com.fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class test implements Serializable {
	static transient int bookId = 101;
	static String boolATittle = "";
	static String author = "";
	static double price = 299;
}

public class Book {
	static transient int bookId = 101;
	static String boolATittle = "";
	static String author = "";
	static double price = 299;

	public static void main(String[] args) throws IOException {
		test t = new test();
		File f = new File("C:\\New folder\\books.ser");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);

	}

}
