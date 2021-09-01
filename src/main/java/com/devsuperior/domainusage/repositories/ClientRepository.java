package com.devsuperior.domainusage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.domainusage.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
