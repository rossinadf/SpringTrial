package cl.advise.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.advise.test.dao.ClienteDAO;
import cl.advise.test.model.Cliente;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClienteDAO clienteDAO;
	
	public int insert(Cliente client) {
		return clienteDAO.insert(client);
	}

	public List<Cliente> getClientList() {
		return clienteDAO.findAll();
	}

}
