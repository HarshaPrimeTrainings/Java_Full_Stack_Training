package com.training;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInpuStreamReaderDemo {

	public static void main(String[] args) throws IOException{
		
		
		FileInputStream fis = new FileInputStream("C:/Users/91770/Desktop/JavaFullstack/invoice.txt");
		BufferedInputStream bis= new BufferedInputStream(fis);
	
		int inputbyte;
		
		while( (inputbyte = bis.read())!=-1) {
			System.out.print((char)inputbyte);
		}
		
		
	}

}
