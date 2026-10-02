package com.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BookDeserializer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("C:\\New folder\\books.ser");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		test t = (test) ois.readObject();
		System.out.println(t.bookId);

	}

}
