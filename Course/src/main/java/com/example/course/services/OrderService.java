package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Order;
import com.example.course.entities.User;
import com.example.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> FindAll()
	{
		return orderRepository.findAll();

	}
	
	public Order FindById(long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
}
