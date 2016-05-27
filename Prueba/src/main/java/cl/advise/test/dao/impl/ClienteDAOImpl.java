package cl.advise.test.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.advise.test.dao.ClienteDAO;
import cl.advise.test.dao.mapper.ClienteMapper;
import cl.advise.test.model.Cliente;

@Repository
public class ClienteDAOImpl extends JdbcDaoSupport implements ClienteDAO{

	private SimpleJdbcInsert insertClienteDao;
	
	@Autowired
	public ClienteDAOImpl(JdbcTemplate jtTienda){
		super.setJdbcTemplate(jtTienda);
		
		this.insertClienteDao = new SimpleJdbcInsert(super.getJdbcTemplate());
		this.insertClienteDao.withTableName("CLIENTE");
		this.insertClienteDao.usingGeneratedKeyColumns("CLIENTE_ID");
	}
	
	@Transactional
	public int insert(Cliente cliente){ 
		SqlParameterSource params = new MapSqlParameterSource().addValue("CLIENTE_NOMBRE", cliente.getNombre()).addValue("CLIENTE_EMAIL", cliente.getEmail());
		Number id = this.insertClienteDao.executeAndReturnKey(params);
		return id.intValue();
	}
	public List<Cliente> findAll(){
		String sql = "SELECT * FROM CLIENTE";
		List<Cliente> clientes = new ArrayList<Cliente>();
		try{
			clientes = super.getJdbcTemplate().query(sql, new ClienteMapper());
		}catch(EmptyResultDataAccessException e){
			System.out.println("Shut");
		}
		
		return clientes;
	}
	
}
