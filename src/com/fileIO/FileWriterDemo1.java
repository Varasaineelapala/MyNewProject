package com.fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\New folder\\test.txt");
		try (FileReader fr = new FileReader(f)) {
			int i = fr.read();
			while (i != -1) {
				System.out.print((char) i);
				i = fr.read();
			}
		}
	}

}
