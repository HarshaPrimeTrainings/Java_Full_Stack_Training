package com.training.userservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.training.userservice.model.User;

@Service
public class UserService {

	List<User> usersList = new ArrayList<User>();

	public UserService() {
		usersList.add(new User(1, "JoeTribiyani", "NY"));
		usersList.add(new User(2, "Monika", "Ohio"));
		usersList.add(new User(3, "Ross", "TXS"));
		usersList.add(new User(4, "Pheebe", "IL"));
		usersList.add(new User(5, "Rachel", "SAN"));
		usersList.add(new User(6, "Chandler", "CHG"));
	}
	
	public List<User> getusers(){
		return usersList;
	}

	
	public User getUserById(int uid) {
		return usersList.stream()
				.filter(u->u.getUid()==uid)
				.findFirst()
				.orElseThrow(()->new RuntimeException("User Not Found"));
	}
	
	public User saveUser(User usr) {
		 usersList.add(usr);
		 return getUserById(usr.getUid());
	}
	
	public User updateUser( int uid, User user) {
		User existing = getUserById(uid);
		if(user.getUsername()!=null)
			existing.setUsername(user.getUsername());
		if(user.getAddr()!=null)
			existing.setAddr(user.getAddr());
		return existing;
	}
	
	public String deleteUser(int uid) {
		User existing = getUserById(uid);
		 usersList.remove(existing);
		return "User Deleted";
	}
}
