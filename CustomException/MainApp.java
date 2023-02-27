package org.training;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
	
		System.out.println("Enter You Age :: ");
		 Scanner sc = new Scanner(System.in);
		 String temp = sc.nextLine();
		 
		  int age = Integer.parseInt(temp);
		  
		  IsAdult is = new IsAdult();
		  try {
		  is.iseligibletoSpoil(age);
		  }catch (AgeException e) {
			e.printStackTrace();
		}
		  System.out.println("Hello Welcome");
		  
	}
}
