package com.projectbancodedados.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectbancodedados.project.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
}