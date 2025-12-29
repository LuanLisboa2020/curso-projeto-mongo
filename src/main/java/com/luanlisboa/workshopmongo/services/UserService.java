package com.luanlisboa.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.luanlisboa.workshopmongo.domain.User;
import com.luanlisboa.workshopmongo.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
    @PostConstruct
    public void checkDatabase() {
        System.out.println(">>> BANCO CONECTADO: " + mongoTemplate.getDb().getName());
        System.out.println(">>> COLLECTIONS: " + mongoTemplate.getCollectionNames());
    }

}
