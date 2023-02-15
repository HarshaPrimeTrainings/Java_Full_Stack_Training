package com.training.oops;

public class Grocery  extends DefaultDiscount{

	public void discount(int price) {
		System.out.println(price - 10);
	}
}
