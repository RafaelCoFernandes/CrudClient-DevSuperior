package com.rafaelfernandes.CrudClientDevSuperior.services;

import java.util.List;

import com.rafaelfernandes.CrudClientDevSuperior.entities.Client;
import com.rafaelfernandes.CrudClientDevSuperior.repositories.ClientRepository;

public class ClientService {

	private ClientRepository repository;

	public List<Client> findAll() {
		return repository.findAll();
	}

}
