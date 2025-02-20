package com.apprest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apprest.apirest.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
