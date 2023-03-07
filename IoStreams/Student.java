package com.training;

import java.io.Serializable;

public class Student implements Serializable{

	int rollnumber = 7;
	String adress = "Hyd";
	transient int age = 15;
	
	void displayDetails() {
		System.out.println("roll = "+ rollnumber + " :: adress = "+ adress);
	}
}
