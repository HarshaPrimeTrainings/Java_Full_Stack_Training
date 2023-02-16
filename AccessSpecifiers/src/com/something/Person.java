package com.something;

public class Person extends AccessSpefierDemo{

	
	public void getlandmark() {
		AccessSpefierDemo ad = new AccessSpefierDemo();
		ad.landmark();
	}
	
	public void gethangout() {
		AccessSpefierDemo ad = new AccessSpefierDemo();
		System.out.println(ad.hangoutspot);
		ad.hangoutpersons();
	}
	
}
