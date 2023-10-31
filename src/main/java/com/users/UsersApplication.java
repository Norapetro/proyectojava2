package com.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController
public class UsersApplication {

	@Autowired
	private UsersRepository usersRepository;

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}
	@GetMapping ("/api/v1/users") //Debuelve la lista de usuarios almacenados
	public List<Users> getUsers () {
		return usersRepository.findAll();
	}

	@GetMapping("/api/v1/users/{id}")
	public Optional<Users> findById(@PathVariable Integer id) {
		return usersRepository.findById(id);
	}
	@PutMapping
	public Users update(@RequestBody Users users) {
		return usersRepository.save(users);
	}
	@DeleteMapping("/api/v1/users/{id}")
	public void deleteById(@PathVariable Integer id) {
		usersRepository.deleteById(id);
	}

}
