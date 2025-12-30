package com.luanlisboa.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.luanlisboa.workshopmongo.domain.User;
import com.luanlisboa.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Silva", "alex@gmail.com");
		User luan = new User(null, "Luan Lisboa", "luan@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, luan));
		
	}

}
