package com.sgic.defect.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defect.entities.User;
import com.sgic.defect.services.UserService;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/saveUser")
	public HttpStatus createBook(@Valid @RequestBody User user) {
		userService.saveUser(user);
		return HttpStatus.CREATED;
	}

	@GetMapping("/findAll")
	public List<User> findAll() {
		return userService.getAllUser();
	}

	@GetMapping("/geUserById/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") String id){
		return new ResponseEntity<User>(userService.findUserById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<User> deleteuser(@PathVariable("id") String id) {
		userService.deleteUserById(id);
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<User> updateuser(@Valid @RequestBody User user) {
		userService.updateUser(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	

}