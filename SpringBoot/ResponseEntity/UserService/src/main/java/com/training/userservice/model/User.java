package com.training.userservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
	
	private int uid;
	private String username;
	private String addr;
	@JsonIgnore
	private String password;
	
	public User(int uid, String username, String addr, String password) {
		super();
		this.uid = uid;
		this.username = username;
		this.addr = addr;
		this.password = password;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", addr=" + addr + ", password=" + password + "]";
	}

	
	

}
