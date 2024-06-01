package com.projectbancodedados.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectbancodedados.project.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}