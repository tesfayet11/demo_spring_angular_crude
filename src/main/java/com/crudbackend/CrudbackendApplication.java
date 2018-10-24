package com.crudbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crudbackend.entities.User;
import com.crudbackend.repository.UserRepository;

@SpringBootApplication
public class CrudbackendApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudbackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("firstName1", "lastName1"));
		userRepository.save(new User("firstName2", "lastName2"));
		userRepository.save(new User("firstName3", "lastName3"));
		userRepository.save(new User("firstName4", "lastName4"));
	}
}
