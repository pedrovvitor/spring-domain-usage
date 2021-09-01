package com.devsuperior.domainusage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.domainusage.entities.Order;
import com.devsuperior.domainusage.repositories.OrderRepository;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {
	
	@Autowired
	OrderRepository orderRepository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
		Order order = orderRepository.findById(id).get();
		return ResponseEntity.ok(order);
	}
	
}
