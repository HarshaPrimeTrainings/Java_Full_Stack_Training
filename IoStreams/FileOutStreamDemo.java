package com.training;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:/Users/91770/Desktop/JavaFullstack/invoice.txt");
		BufferedInputStream bis= new BufferedInputStream(fis);
		
		 FileOutputStream fos = new FileOutputStream("C:\\Users\\91770\\Desktop\\JavaFullstack\\output.txt");

		 int inputbyte;
			
			while( (inputbyte = bis.read())!=-1) {
				fos.write(inputbyte);
			}
			System.out.println("File Write success");
			fis.close();
			fos.close();
			bis.close();
		 
	}

}
