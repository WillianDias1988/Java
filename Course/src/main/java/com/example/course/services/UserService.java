package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> FindAll()
	{
		return userRepository.findAll();

	}
	
	public User FindById(long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
}
