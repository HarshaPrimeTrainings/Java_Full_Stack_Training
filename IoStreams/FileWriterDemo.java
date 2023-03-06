package com.training;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\91770\\Desktop\\JavaFullstack\\myfile.txt");
		
		FileWriter fw = new FileWriter(f);
		
		String s = "Hello Invoice paid succfully";
		
		fw.write(s);
		
		System.out.println("File Write success");
		fw.close();
		
	}

}
