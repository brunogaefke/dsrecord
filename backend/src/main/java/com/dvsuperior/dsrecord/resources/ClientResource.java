package com.dvsuperior.dsrecord.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvsuperior.dsrecord.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> FindAll() {
		List<Client> list = new ArrayList<>(); 
		list.add(new Client());
		list.add(new Client());
		return ResponseEntity.ok().body(list);
		
	}

}
