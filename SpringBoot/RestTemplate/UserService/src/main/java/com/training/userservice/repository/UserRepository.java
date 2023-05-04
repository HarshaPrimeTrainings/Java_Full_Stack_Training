package com.training.userservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.userservice.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	public User findByUsername(String username);
	
	public List<User> getByAddr(String addr);
}
