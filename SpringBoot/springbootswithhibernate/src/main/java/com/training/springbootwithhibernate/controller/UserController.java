package com.training.springbootwithhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springbootwithhibernate.model.Users;
import com.training.springbootwithhibernate.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	UserService service;
	
	@PostMapping("/save")
	public String save(@RequestBody Users user) {
		service.saveUser(user);
		return "User Saved";
	}
	
	
	
}
