package com.training;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Samsung");
		al.add("Nokia");
		al.add("Apple");
		al.add("BlackBerry");
		al.add("Sony");
		al.add("Motorola");
		System.out.println(al);
		al.add(1, "HTC");
		System.out.println(al);
		al.add("BlackBerry");
		System.out.println(al);
		System.out.println("Size :: "+ al.size());
		al.remove(0);
		System.out.println("Size :: "+ al.size());
		System.out.println(al);
		al.remove("Apple");
		System.out.println(al);

		System.out.println(al);
		
		System.out.println(al.get(4));
		
		
		for(int i = 0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("=== For Each ===");
		for(Object obj:al) {
			System.out.println(obj.toString());
			
		}
		
		Iterator ir = al.iterator();
		
		System.out.println(" === Iterator === ");
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		
	}

}
