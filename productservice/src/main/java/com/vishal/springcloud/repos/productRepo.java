package com.vishal.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.springcloud.model.Product;

public interface productRepo extends JpaRepository<Product, Long> {

	
}
