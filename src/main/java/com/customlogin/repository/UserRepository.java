package com.customlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customlogin.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
