package com.example.desafio3spring.services;

import java.util.List;

import com.example.desafio3spring.entities.Cliente;

public interface ClienteServiceI {
	
	
	public void añadirCliente(Cliente cli);
	public List mostrarCliente();
	public void searchByNameLastName();
	public void borrarCliente(Cliente cli);

}
