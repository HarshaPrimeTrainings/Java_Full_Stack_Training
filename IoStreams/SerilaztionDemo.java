package com.training;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilaztionDemo {

	public static void main(String[] args) throws IOException {

		  FileOutputStream fos = new FileOutputStream("C:\\Users\\91770\\Desktop\\JavaFullstack\\student.txt");
		  
		  ObjectOutputStream oos = new ObjectOutputStream(fos);
		  Student s = new Student();
		  oos.writeObject(s);
		  oos.flush();
		  oos.close();
		  System.out.println("Serilization Complete");
	}

}
