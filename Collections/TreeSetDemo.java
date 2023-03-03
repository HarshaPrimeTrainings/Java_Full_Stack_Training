package com.training;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set ts = new TreeSet();
		 
		ts.add("Nokia");
		 ts.add("Sony");
		 ts.add("Apple");
		 ts.add("Motorola");
		 ts.add("BlackBerry");
		 ts.add("HTC");
		 ts.add("HTC");
		 ts.add("Apple");
		 System.out.println(ts);
		 Iterator ir = ts.iterator();
		 while(ir.hasNext()) {
			 System.out.println(ir.next());
		 }

	}

}
