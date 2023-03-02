package com.training;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		// insert the element
		s.push("Samsung"); 
		s.push("Apple"); 
		s.push("Htc");
		s.push("Nokia");
		s.push("Motorola");
		s.push("Sony"); 
		
		System.out.println(s);
		// Pop will return the top most element By removing from the Stack
		System.out.println(s.pop());
		System.out.println(s);
		
		//peek method will return element without removing from stack
		System.out.println(s.peek());
		System.out.println(s);
		

	}

}
