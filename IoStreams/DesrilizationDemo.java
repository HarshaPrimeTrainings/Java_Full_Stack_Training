package com.training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesrilizationDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis  = new FileInputStream("C:\\Users\\91770\\Desktop\\JavaFullstack\\student.txt");
		ObjectInputStream objs = new ObjectInputStream(fis);
		Object o = objs.readObject();
		Student s = (Student)o;
		s.displayDetails();
		
		System.out.println(s.age);
		
	}

}
