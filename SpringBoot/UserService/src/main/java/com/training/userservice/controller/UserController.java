package com.training.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.userservice.model.User;
import com.training.userservice.services.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping(value = "/users")
	public List<User> getusers(){
		return service.getusers();
	}
	
	@GetMapping("/userbyid/{uid}")
	public User getUserById(@PathVariable int uid) {
		return service.getUserById(uid);
		
	}
	
	@PostMapping(value = "/save")
	public User saveUser(@RequestBody User usr) {
			return service.saveUser(usr);
	}
	
	@PutMapping(value = "/update/{uid}")
	public User updateUser(@PathVariable int uid,@RequestBody User user) {
		return service.updateUser(uid, user);
	}
	
	@DeleteMapping(value = "/delete/{uid}")
	public String deleteUser(@PathVariable int uid) {
		return service.deleteUser(uid);
	}
	
}
