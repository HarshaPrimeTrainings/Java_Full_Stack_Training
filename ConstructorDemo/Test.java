package com.other;

import com.something.Person;

public class Test {

	public static void main(String[] args) {
		
	
		Person p3 = new Person();
		System.out.println(p3.toString());
		
		Person p4 = new Person(1);
		System.out.println(p4.toString());
		
		Person p  = new Person(1,"Joe");
		System.out.println(p.toString());
		
	}
}
