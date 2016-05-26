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

import cl.advise.test.dao.ProductoDAO;
import cl.advise.test.dao.mapper.ProductoMapper;
import cl.advise.test.model.Producto;

@Repository
public class ProductoDAOImpl extends JdbcDaoSupport implements ProductoDAO {
	
	private SimpleJdbcInsert insertProductoDao;
	
	@Autowired
	public ProductoDAOImpl(JdbcTemplate jtTienda){
		super.setJdbcTemplate(jtTienda);
		
		this.insertProductoDao = new SimpleJdbcInsert(super.getJdbcTemplate());
		this.insertProductoDao.withTableName("PRODUCTO");
		this.insertProductoDao.usingGeneratedKeyColumns("ID_PRODUCTO");
	}
	
	@Transactional
	public int insert(Producto producto){
		SqlParameterSource params = new MapSqlParameterSource().addValue("PRODUCTO_NOMBRE", producto.getNombre());
		Number id = this.insertProductoDao.executeAndReturnKey(params);
		return id.intValue();
	}
	
	/*
	public Producto findById(int prodId){
		
		String sql = "SELECT * FROM rosangela.PRODUCTO WHERE CUST_ID = ?";
		Producto producto = null;
		try {
			producto = jdbcTemplate.queryForObject(sql, new Object[] { prodId }, new ProductoMapper());
			
		} catch (EmptyResultDataAccessException e) {
			//TO-DO: Death you should inform 
		} 
		return producto;
	}
	*/
	
	public List<Producto> findAll(){
		String sql = "SELECT * FROM PRODUCTO";
		List<Producto> productos = new ArrayList<Producto>();
		try{
			productos = super.getJdbcTemplate().query(sql, new ProductoMapper());
		}catch(EmptyResultDataAccessException e){
			System.out.println("Shut");
		}
		
		return productos;
	}
}
