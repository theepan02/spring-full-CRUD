package com.sgic.defect.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.defect.entities.User;

public interface UserRepositories extends JpaRepository<User, String> {
	User findUserByUserId(String id);
}
