package com.training;


public class RunnableDemo implements Runnable{
	
	public void run() {
		for(int i = 1;i<=10;i++) {
			System.out.println(" Number :: "+ i);
		}
	}

	public static void main(String[] args) {
		RunnableDemo rd = new RunnableDemo();
		  Thread t = new Thread(rd);
		  t.start();
	}

}
