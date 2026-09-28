package com.fileIO;

import java.io.File;
import java.io.IOException;

public class FileIOTestDemo1 {

	public static void main(String[] args) {

		File f = new File("C:\\New folder\\test.txt");
		try {
			if (!f.exists()) {
				boolean flag = f.createNewFile();
				if (flag) {
					System.out.println("file has been created successfully..!");
				} else {
					System.out.println("something went wrong..!");
				}
			} else {
				System.out.println("File already exists..!");
			}
		} catch (IOException fio) {
			System.out.println("in catch");
		}
		
		
	}

}
