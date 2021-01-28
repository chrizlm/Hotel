package com.example.hotelSB.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotelSB.model.User;

public interface UserRepo extends JpaRepository<User, Integer> 
{
	User findByUsername(String username);
}
