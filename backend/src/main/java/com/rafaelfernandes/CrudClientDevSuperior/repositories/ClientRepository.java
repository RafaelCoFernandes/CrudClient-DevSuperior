package com.rafaelfernandes.CrudClientDevSuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaelfernandes.CrudClientDevSuperior.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
