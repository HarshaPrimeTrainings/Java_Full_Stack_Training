package com.something;

public class AccessSpefierDemo {
	
	public String username = "JoeTribialy";
	protected String  adress = "Hyd";
	String hangoutspot = "RetroMadhapur";
	private String cardpin = "1213456";
	
	
	public void greet() {
		System.out.println("Hi How you doing");
	}

	protected void landmark() {
		System.out.println("Hyd Besid MyHome Ambnhuja");
	}
	
	void hangoutpersons() {
		System.out.println("6 idiots from IIT kanpur");
	}
	
	private void getcard() {
		System.out.println(cardpin);
	}
	
	public void getcardfdetails() {
		getcard();
	}
	
}
