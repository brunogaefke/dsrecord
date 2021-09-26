package com.dvsuperior.dsrecord.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvsuperior.dsrecord.dto.ClientDTO;
import com.dvsuperior.dsrecord.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	private ClientService service;

	@GetMapping
	public ResponseEntity<List<ClientDTO>> FindAll() {
		List<ClientDTO> list = service.findAll();
		return ResponseEntity.ok().body(list); 
	}
}
