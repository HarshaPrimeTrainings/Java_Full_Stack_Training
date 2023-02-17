package com.something;

public class Person {
	
	int id;
	String name;
	
	public Person() {
		
	}
	
	public Person(int id) {
		this.id = id;
	}
	
	public  Person(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
		
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}
