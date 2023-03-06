package com.training;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInputReaderDemo {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\91770\\Desktop\\JavaFullstack\\invoice.txt");
		
		FileReader fr = new FileReader(f);
		int inputchar;
		
		while( (inputchar = fr.read())!=-1) {
			System.out.print((char)inputchar);
		}
	}

}
