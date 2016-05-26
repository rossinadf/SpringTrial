package cl.advise.test.dao;

import java.util.List;

import cl.advise.test.model.Producto;

public interface ProductoDAO {
	
	public int insert(Producto producto);
	public List<Producto> findAll();
	
}
