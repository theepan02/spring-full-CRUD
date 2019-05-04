package com.sgic.defect.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defect.entities.User;
import com.sgic.defect.repositories.UserRepositories;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepositories userRepositories;


	//SAVE USER
	@Override
	public void saveUser(User user) {
		userRepositories.save(user);	
	}

	//LIST ALL USER
	@Override
	public List<User> getAllUser() {
		return userRepositories.findAll();
	}
	
	//DELETE USER BY ID
	
	public User deleteUserById(String id) {
		userRepositories.deleteById(id);
		 return null;
	}

	//UPDATE USER
	@Override
	public void updateUser(User user) {
		userRepositories.save(user);	
		
	}
	 //FIND USER BY PERTICULAR ID
	@Override
	public User findUserById(String id) {
		return userRepositories.findUserByUserId(id);
	}
	
}
