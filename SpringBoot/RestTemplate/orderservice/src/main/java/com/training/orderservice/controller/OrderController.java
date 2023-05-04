package com.training.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.orderservice.model.Orders;
import com.training.orderservice.model.repositories.OrderRepository;

@RestController
public class OrderController {

	@Autowired
	OrderRepository repo;

	@GetMapping("/greet")
	public String greet() {
		return "Greetings From Order Service";
	}
	
	
	@GetMapping("/orders")
	public List<Orders> getAllOrders(){
		return (List<Orders>) repo.findAll();
	}
	
	@GetMapping("/order/{uid}")
	public List<Orders> getOrdersByuid(@PathVariable Integer uid){
		return repo.getByUid(uid);
	}
	
	
	
	@PostMapping("/save")
	public Orders saveorder(@RequestBody Orders order){
		return repo.save(order);
	}
}
