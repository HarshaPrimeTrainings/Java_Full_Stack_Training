package com.training.userservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.userservice.exceptions.UserNotFoundException;
import com.training.userservice.model.User;
import com.training.userservice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	
	public List<User> getusers(){
		return (List<User>) repo.findAll();
	}

	
	public User getUserById(int uid) {
		return repo.findById(uid).stream()
				.filter(u->u.getUid()==uid)
				.findFirst()
				.orElseThrow(()->new UserNotFoundException("User Not Found with id: "+ uid));
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
