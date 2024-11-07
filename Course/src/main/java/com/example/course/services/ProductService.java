package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Product;
import com.example.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository ProductRepository;
	
	public List<Product> FindAll()
	{
		return ProductRepository.findAll();

	}
	
	public Product FindById(long id) {
		Optional<Product> obj = ProductRepository.findById(id);
		return obj.get();
	}
}
