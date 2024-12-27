package com.anju.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anju.demo.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
