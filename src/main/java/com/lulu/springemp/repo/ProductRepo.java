package com.lulu.springemp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulu.springemp.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	
}
