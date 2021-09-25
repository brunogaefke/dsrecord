package com.dvsuperior.dsrecord.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvsuperior.dsrecord.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
