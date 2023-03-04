package com.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		
		l.add("Nokia");
		l.add("Samsung");
		l.add("Asus");
		
		 Iterator<String> ir = l.iterator();

		 while (ir.hasNext()) {
		System.out.println(ir.next().toUpperCase());
		}
		
	}

}
