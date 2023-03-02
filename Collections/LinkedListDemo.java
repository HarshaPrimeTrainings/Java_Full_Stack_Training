package com.training;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add("Samsung"); 
		ll.add("Apple"); 
		ll.add("Htc");
		ll.add("Nokia");
		ll.add("Motorola");
		ll.add("Sony"); 
		
		System.out.println(ll);
		
		 Iterator ir = ll.iterator();
		 
		 while(ir.hasNext()) {
			 System.out.println(ir.next());
		 }
		
	}

}
