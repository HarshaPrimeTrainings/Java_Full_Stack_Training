package com.training.userservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.training.userservice.exceptions.UserNotFoundException;
import com.training.userservice.model.User;

@Service
public class UserService {

	List<User> usersList = new ArrayList<User>();

	public UserService() {
		usersList.add(new User(1, "JoeTribiyani", "NY","121345"));
		usersList.add(new User(2, "Monika", "Ohio","121345"));
		usersList.add(new User(3, "Ross", "TXS","121345"));
		usersList.add(new User(4, "Pheebe", "IL","121345"));
		usersList.add(new User(5, "Rachel", "SAN","121345"));
		usersList.add(new User(6, "Chandler", "CHG","121345"));
	}
	
	public List<User> getusers(){
		return usersList;
	}

	
	public User getUserById(int uid) {
		return usersList.stream()
				.filter(u->u.getUid()==uid)
				.findFirst()
				.orElseThrow(()->new UserNotFoundException("User Not Found with id: "+ uid));
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
