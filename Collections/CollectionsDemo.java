package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add("Nokia");
		l.add("Samsung");
		l.add("Asus");
		l.add("Htc");
		l.add("Apple");
		l.add("Sony");
		
		System.out.println(l);
		
	
		Collections.sort(l);
		System.out.println(l);
		
		
	}
}
