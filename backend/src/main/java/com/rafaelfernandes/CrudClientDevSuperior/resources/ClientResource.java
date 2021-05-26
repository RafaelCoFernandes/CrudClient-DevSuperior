package com.rafaelfernandes.CrudClientDevSuperior.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelfernandes.CrudClientDevSuperior.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "João Paulo Goncalves Sobrinho", "057.985.361-68", 4000.00,
				Instant.parse("2020-07-13T20:50:07.12345Z"), 0));
		return ResponseEntity.ok().body(list);
	}

}
