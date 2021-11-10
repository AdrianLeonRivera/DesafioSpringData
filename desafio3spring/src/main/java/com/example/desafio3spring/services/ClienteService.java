package com.example.desafio3spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.desafio3spring.entities.Cliente;
import com.example.desafio3spring.repository.ClienteRepositoryI;

public class ClienteService implements ClienteServiceI{

	@Autowired
	public ClienteRepositoryI repository;
	
	@Override
	public void searchByNameLastName() {
		
		
	}

	@Override
	public void añadirCliente(Cliente cli) {
		repository.save(cli);
	}

	@Override
	public List mostrarCliente() {
		return repository.findAll();
	}

	@Override
	public void borrarCliente(Cliente cli) {
		repository.delete(cli);
		
	}
	
}
