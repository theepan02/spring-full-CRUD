package com.sgic.defect.services;

import java.util.List;

import com.sgic.defect.entities.User;

public interface UserService {
	void saveUser(User user);// save User
	List<User> getAllUser();		//	Get All User
	User findUserById(String id); // find book by id - UserID
	User deleteUserById(String id);	//	Delete User
	void updateUser(User user);		//	Update User
	
}
