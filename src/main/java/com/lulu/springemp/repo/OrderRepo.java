package com.lulu.springemp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulu.springemp.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {
	
}
