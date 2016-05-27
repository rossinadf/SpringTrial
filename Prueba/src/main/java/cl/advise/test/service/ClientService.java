package cl.advise.test.service;

import java.util.List;

import cl.advise.test.model.Cliente;

public interface ClientService {

	public int insert(Cliente client);
	public List<Cliente> getClientList();
}
