package com.anju.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anju.demo.model.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
