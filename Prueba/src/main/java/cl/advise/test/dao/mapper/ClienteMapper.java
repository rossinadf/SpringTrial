package cl.advise.test.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.advise.test.model.Cliente;

public class ClienteMapper implements RowMapper<Cliente>{

	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setId(rs.getInt("CLIENTE_ID"));
		cliente.setNombre(rs.getString("CLIENTE_NOMBRE"));
		return cliente;
	}
}
