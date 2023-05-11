package com.training.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.userservice.dto.UserDetails;
import com.training.userservice.model.User;
import com.training.userservice.services.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/hello")
	public String greet() {
		return service.greet();
	}
	
	@GetMapping("/orders/{uid}")
	public UserDetails getUserDetails(@PathVariable Integer uid){
		return service.getUserOrders(uid);
	}
	
	@GetMapping(value = "/users")
	public ResponseEntity<List<User>>getusers(){
		return new ResponseEntity<List<User>>(service.getusers(), HttpStatus.OK);
	}
	
	@GetMapping("/userbyid/{uid}")
	public ResponseEntity<User> getUserById(@PathVariable int uid) {
		return new ResponseEntity<User>(service.getUserById(uid), HttpStatus.OK);
	}
	
	@GetMapping("/userbyname/{uname}")
	public ResponseEntity<User> getUserByName(@PathVariable String uname) {
		return new ResponseEntity<User>(service.getUserByName(uname), HttpStatus.OK);
	}
	
	@GetMapping("/userbyaddr/{addr}")
	public ResponseEntity<List<User>> getUserByAddr(@PathVariable String addr) {
		return new ResponseEntity<List<User>>(service.getByaddr(addr), HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/save")
	public ResponseEntity<User> saveUser(@RequestBody User usr) {
			return new ResponseEntity<User>(service.saveUser(usr),HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/update/{uid}")
	public ResponseEntity<User> updateUser(@PathVariable int uid,@RequestBody User user) {
		return new ResponseEntity<User>(service.updateUser(uid, user),HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/delete/{uid}")
	public ResponseEntity<String> deleteUser(@PathVariable int uid) {
		return new ResponseEntity<String>(service.deleteUser(uid),HttpStatus.OK);
	}
	
}
