package com.training;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("Samsung"); 
		v.add("Apple"); 
		v.add("Htc");
		v.add("Nokia");
		v.add("Motorola");
		v.add("Sony"); 
		
		System.out.println(v);
		
		 Iterator ir = v.iterator();
		 
		 while(ir.hasNext()) {
			 System.out.println(ir.next());
		 }
	}
}
