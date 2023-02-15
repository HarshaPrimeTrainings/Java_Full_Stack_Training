package com.training.oops;

public class MainApp {
	
	public static void main(String[] args) {
	
		LoanPercentage loan = new PersonalLoan();
		
		loan.calculatePercentage();
		
		LoanPercentage l = new Customer();
		
		l.calculatePercentage();
		
		Enqury e = new Customer();
		
		e.getDetails();
		
		
	}
}
