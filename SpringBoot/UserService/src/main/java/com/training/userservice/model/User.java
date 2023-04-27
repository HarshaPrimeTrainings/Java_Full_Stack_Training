package com.training.userservice.model;

public class User {
	
	private int uid;
	private String username;
	private String addr;
	
	public User(int uid, String username,  String addr) {
		this.uid = uid;
		this.username = username;
		this.addr = addr;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	

}
