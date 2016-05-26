package cl.advise.test.service;

import java.util.List;

import cl.advise.test.model.Producto;

public interface ProductService {

	public int insert(Producto product);
	public List<Producto> getProductList();
	
}
