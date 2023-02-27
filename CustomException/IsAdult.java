package org.training;

public class IsAdult {
	
	public void iseligibletoSpoil(int age) {
		if(age<18) {
			  throw new AgeException("Age should not less than 18");
		  }else {
			  System.out.println("You are Eligible to Caste your vote !! then you can spoil");
		  }
	}

}
