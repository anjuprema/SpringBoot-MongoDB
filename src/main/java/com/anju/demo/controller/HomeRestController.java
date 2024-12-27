package com.anju.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anju.demo.model.Product;
import com.anju.demo.model.User;
import com.anju.demo.repository.ProductRepository;
import com.anju.demo.repository.UserRepository;

@RestController
@RequestMapping("")
public class HomeRestController {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	ProductRepository productRepo;
	
	@GetMapping("/home")
	public String helloWorld() {
		return "Hello World";
	}
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		return user;
		//return userRepo.save(user);		
	}	
	
	@GetMapping("/listUser")
	public List<User> listUser(){
		return userRepo.findAll();
	}
	
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		return productRepo.save(product);
	}
	
	@GetMapping("/listProduct")
	public List<Product> listProduct(){
		return productRepo.findAll();
	}
}
