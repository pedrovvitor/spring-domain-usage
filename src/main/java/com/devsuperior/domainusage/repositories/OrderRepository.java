package com.devsuperior.domainusage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.domainusage.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
