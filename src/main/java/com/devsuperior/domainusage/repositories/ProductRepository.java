package com.devsuperior.domainusage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.domainusage.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
