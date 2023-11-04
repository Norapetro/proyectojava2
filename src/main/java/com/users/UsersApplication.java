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
	@PutMapping ("/api/v1/users/{idUser}")
	public Users update(@RequestBody Users userToUpdate, @PathVariable Integer idUser) {
		Optional<Users> userDBOpt = this.usersRepository.findById(idUser);
		if (userDBOpt.isPresent()) {
			Users userDB = userDBOpt.get();
			if (userToUpdate.getFirstName()!= null){
				userDB.setFirstName(userToUpdate.getFirstName());
			}
			if (userToUpdate.getLastName()!= null){
				userDB.setLastName(userToUpdate.getLastName());
			}
			if (userToUpdate.getDateBirth()!= null){
				userDB.setDateBirth(userToUpdate.getDateBirth());
			}
			if (userToUpdate.getAddress()!= null){
				userDB.setAddress(userToUpdate.getAddress());
			}
			if (userToUpdate.getToken()!= null){
				userDB.setToken(userToUpdate.getToken());
			}
			if (userToUpdate.getPassword()!= null){
				userDB.setPassword(userToUpdate.getPassword());
			}
			if (userToUpdate.getMobilePhone()!= null){
				userDB.setMobilePhone(userToUpdate.getMobilePhone());
			}
			if (userToUpdate.getEmail()!= null){
				userDB.setEmail(userToUpdate.getEmail());
			}
			return usersRepository.save(userDB);
		}
		throw new RuntimeException("User no encontrado");
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
