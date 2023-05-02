package com.training.springbootwithhibernate.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springbootwithhibernate.model.Users;

@Service
public class UserService {

	@Autowired
	SessionFactory sf;
	
	public String saveUser(Users u) {
		 Session session = sf.openSession();
		 Transaction tx = session.beginTransaction();
		 session.save(u);
		 tx.commit();
		 session.close();
		 return "UserSaved Succesfully";
	}
	
	
	
	
}
