package com.training;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> hm= new TreeMap<String,Integer>();
		 
		 hm.put("xyz", 123);
		 hm.put("dba", 154);
		 hm.put("pqr", 123);
		 hm.put("a", 111);
		 hm.put("b", 129);
		 hm.put("b", 156);
		 hm.put("abc", 123);
		 System.out.println(hm);
		 
		 System.out.println(hm.get("a"));
		 System.out.println(hm.get("dba"));
		 
		 Set ks = hm.keySet();
		 
		 System.out.println(ks);
		  Iterator ir = ks.iterator();
		
		  while(ir.hasNext()) {
			  String key = (String) ir.next();
			 System.out.println(key+" :: "+ hm.get(key));
		  }

	}

}
