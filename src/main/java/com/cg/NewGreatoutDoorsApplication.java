package com.cg;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewGreatoutDoorsApplication implements CommandLineRunner {

	@PersistenceContext
	EntityManager em;
	
	public static void main(String[] args) {
		SpringApplication.run(NewGreatoutDoorsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
