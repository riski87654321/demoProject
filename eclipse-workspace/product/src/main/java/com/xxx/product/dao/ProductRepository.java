package com.xxx.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xxx.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
