package com.projectbancodedados.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectbancodedados.project.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}