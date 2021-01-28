package com.example.hotelSB.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotelSB.model.Chef;



public interface ChefRepo extends JpaRepository<Chef, Integer>
{

}
