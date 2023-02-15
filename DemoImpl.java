package com.training.oops;

public abstract class DemoImpl implements DemoInterface{
	
	@Override
	public void display() {
		System.out.println("Display Method");
		
	}

	
	public void getMessage() {
		System.out.println("Get Message");
		
	}

	void mymethod() {
		System.out.println("MyMethod");
	}
}
