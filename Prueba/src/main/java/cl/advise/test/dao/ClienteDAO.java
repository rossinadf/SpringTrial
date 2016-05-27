package cl.advise.test.dao;

import java.util.List;

import cl.advise.test.model.Cliente;

public interface ClienteDAO {

	public int insert(Cliente cliente);
	public List<Cliente> findAll();
}
