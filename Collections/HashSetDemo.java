package com.training;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		 Set hs = new HashSet();
		 
		 hs.add("Nokia");
		 hs.add("Sony");
		 hs.add("Apple");
		 hs.add("Motorola");
		 hs.add("BlackBerry");
		 hs.add("HTC");
		 hs.add("HTC");
		 hs.add("Apple");
		 hs.add(null);
		 System.out.println(hs);
		 Iterator ir = hs.iterator();
		 while(ir.hasNext()) {
			 System.out.println(ir.next());
		 }
	}

}
