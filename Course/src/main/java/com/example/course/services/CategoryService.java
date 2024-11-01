package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Category;
import com.example.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository CategoryRepository;
	
	public List<Category> FindAll()
	{
		return CategoryRepository.findAll();

	}
	
	public Category FindById(long id) {
		Optional<Category> obj = CategoryRepository.findById(id);
		return obj.get();
	}
}
