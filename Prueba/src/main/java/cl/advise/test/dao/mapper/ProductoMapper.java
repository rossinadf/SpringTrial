package cl.advise.test.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.advise.test.model.Producto;

public class ProductoMapper implements RowMapper<Producto>{

	@Override
	public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
		Producto producto = new Producto();
		producto.setId(rs.getInt("PRODUCTO_ID"));
		producto.setNombre(rs.getString("PRODUCTO_NOMBRE"));
		return producto;
	}
	
}
