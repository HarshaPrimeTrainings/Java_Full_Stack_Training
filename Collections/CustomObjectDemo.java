package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CustomObjectDemo {

	public static void main(String[] args) {
		 Product p1 = new Product(1, "Book", 25.5);
		 Product p2 = new Product(2, "Mobile", 125.5);
		 Product p3 = new Product(3, "Laptop", 56.5);
		 Product p4 = new Product(4, "Casomotic", 75.5);
		 Product p5 = new Product(5, "Garments", 95.5);
		 
		 ArrayList<Product>  al = new ArrayList<Product>();
		 al.add(p1);
		 al.add(p3);
		 al.add(p5);
		 al.add(p2);
		 al.add(p4);
		 
		 System.out.println(" ====== Default Sorting ========");
		 Collections.sort(al);
		 Iterator<Product> ir = al.iterator();
		  while(ir.hasNext()) {
			  Product p = ir.next();
			  System.out.println(p.pid + " :: "+ p.pname +":: "+ p.price );
		  }
		  
		 
		 System.out.println(" ====== Name Sorting ========");
		 Collections.sort(al,new PnamComperator());
		 Iterator<Product> ir1 = al.iterator();
		  while(ir1.hasNext()) {
			  Product p = ir1.next();
			  System.out.println(p.pid + " :: "+ p.pname +":: "+ p.price );
		  }
		  
		  System.out.println(" ====== Price Sorting ========");
		  
		  Collections.sort(al,new PrPriceComperoator());
			 Iterator<Product> ir2 = al.iterator();
			  while(ir2.hasNext()) {
				  Product p = ir2.next();
				  System.out.println(p.pid + " :: "+ p.pname +":: "+ p.price );
			  }
			 
		 
	}
}
