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
	@GetMapping ("/api/v1/users") //Debuelve la lista de usuarios almacenados ok
	public List<Users> getUsers () {
		return usersRepository.findAll();
	}

	@GetMapping("/api/v1/users/{id}") //debuelve por el ID ok
	public Optional<Users> findById(@PathVariable Integer id) {
		return usersRepository.findById(id);
	}

	//PUT
	@PutMapping
	public Users update(@RequestBody Users users) {
		return usersRepository.save(users);
	}


	//DELETE
	@DeleteMapping("/api/v1/users/{id}")
	public void deleteById(@PathVariable Integer id) {
		usersRepository.deleteById(id); //No retorna nada porque estamos eliminando ok
	}
	//POST
	@ResponseStatus
	@PostMapping ("/api/v1/users")
	public Users create(@RequestBody Users users) {
		return usersRepository.save(users);
	}

}
