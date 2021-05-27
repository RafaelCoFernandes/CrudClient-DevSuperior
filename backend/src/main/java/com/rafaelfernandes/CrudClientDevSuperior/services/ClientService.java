package com.rafaelfernandes.CrudClientDevSuperior.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaelfernandes.CrudClientDevSuperior.dto.ClientDTO;
import com.rafaelfernandes.CrudClientDevSuperior.entities.Client;
import com.rafaelfernandes.CrudClientDevSuperior.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> list = repository.findAll();
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}
}
