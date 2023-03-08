package com.training;

public class MyThreadDemo extends Thread{
	
	public void run() {
		for(int i = 1;i<=10;i++) {
			System.out.println(" Number :: "+ i);
		}
	}

	public static void main(String[] args) {
		 MyThreadDemo mt = new MyThreadDemo();
		  Thread t = new Thread(mt);
		  t.setName("First Thread");
		  t.start();
	}
}
