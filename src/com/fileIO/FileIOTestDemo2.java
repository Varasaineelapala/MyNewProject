package com.fileIO;

import java.io.File;
import java.io.IOException;

public class FileIOTestDemo2 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\New Folder\\Test2 Folder");
		boolean flag = f1.mkdir();
		if (flag) {
			System.out.println("folder has been created successfully...!");
		} else {
			System.out.println("Something went wrong...!");
		}
		File f2 = new File(f1, "test2.txt");
		boolean flag2 = f2.createNewFile();
		if (flag2) {
			System.out.println("file has been created successfully...!");
		} else {
			System.out.println("something went wrong...!");
		}
		System.out.println(f2.canExecute());
		System.out.println(f2.canRead());
		System.out.println(f2.canWrite());
		
		System.out.println(f2.getAbsolutePath());
		System.out.println(f2.getCanonicalPath());
		System.out.println(f2.getFreeSpace());
		System.out.println(f2.getTotalSpace());

	}
}
