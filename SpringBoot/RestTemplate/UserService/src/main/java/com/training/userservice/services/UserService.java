package com.training.userservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.training.userservice.dto.OrderDto;
import com.training.userservice.dto.UserDetails;
import com.training.userservice.exceptions.UserNotFoundException;
import com.training.userservice.model.User;
import com.training.userservice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	@Autowired
	RestTemplate rest;
	
	public String greet() {
		return rest.getForObject("http://localhost:8087/greet", String.class);
	}
	
	
	public List<User> getusers(){
		return (List<User>) repo.findAll();
	}

	
	public User getUserById(int uid) {
		return repo.findById(uid).stream()
				.filter(u->u.getUid()==uid)
				.findFirst()
				.orElseThrow(()->new UserNotFoundException("User Not Found with id: "+ uid));
	}
	
	public UserDetails getUserOrders(Integer uid) {
		UserDetails userdto = new UserDetails();
		 User u = this.getUserById(uid);
		 userdto.setUid(u.getUid());
		 userdto.setUsername(u.getUsername());
		 userdto.setAddr(u.getAddr());
		 List<OrderDto> orders = rest.getForObject("http://localhost:8087/order/"+uid, List.class);
		 userdto.setOrders(orders);
		 return userdto;
	} 
	
	public User getUserByName(String username) {
		return repo.findByUsername(username);
	}
	
	public List<User> getByaddr(String addr) {
		return repo.getByAddr(addr);
	}
	
	
	public User saveUser(User usr) {
		 return repo.save(usr);
	}
	
	public User updateUser( int uid, User user) {
		User existing = getUserById(uid);
		if(user.getUsername()!=null)
			existing.setUsername(user.getUsername());
		if(user.getAddr()!=null)
			existing.setAddr(user.getAddr());
		return repo.save(existing);
	}
	
	public String deleteUser(int uid) {
		repo.deleteById(uid);
		return "User Deleted";
	}
}
