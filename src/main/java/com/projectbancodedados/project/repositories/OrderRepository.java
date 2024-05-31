package com.projectbancodedados.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectbancodedados.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}