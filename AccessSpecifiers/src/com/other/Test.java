package com.other;

import com.something.AccessSpefierDemo;
import com.something.Person;

public class Test {

	public static void main(String[] args) {
		
		AccessSpefierDemo d = new AccessSpefierDemo();
		System.out.println(d.username);
		d.greet();
		d.getcardfdetails();
		
		MyClass m = new MyClass();
		m.demo();
		
		Person p = new Person();
		p.gethangout();
	

		
	}
}
