package com.training;

public class Product implements Comparable<Product>{

	public int pid;
	public String pname;
	public double price;
	
	public Product(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		if(pid == o.pid) {
			return 0;
		}else if(pid>o.pid){
			return 1;
		}
		return -1;
	}

	
	
	
	
	
}
