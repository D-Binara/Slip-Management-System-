package com.slipMangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slipMangement.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByEmail(String email);

}
