package com.fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Started");
		try (FileWriter fr = new FileWriter("C:\\New folder\\test.txt")) {
			fr.write('\n');
			fr.write('A');
			fr.write('\n');
			fr.write(66);
			fr.write('\n');
			fr.write(67);
		}
		System.out.println("Started");
	}

}
