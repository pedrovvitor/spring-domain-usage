package com.devsuperior.domainusage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.domainusage.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
