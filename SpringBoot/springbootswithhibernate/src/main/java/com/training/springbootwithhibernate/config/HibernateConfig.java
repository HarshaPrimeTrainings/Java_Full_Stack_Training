package com.training.springbootwithhibernate.config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfig {

	@Bean
	public SessionFactory initfatory() {
		 org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration();
		  SessionFactory sf = cfg.configure().buildSessionFactory();
		  return sf;
	}
	
}
