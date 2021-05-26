package com.rafaelfernandes.CrudClientDevSuperior.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelfernandes.CrudClientDevSuperior.entities.Client;
import com.rafaelfernandes.CrudClientDevSuperior.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	private ClientService service;

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
