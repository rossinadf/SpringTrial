package cl.advise.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.advise.test.dao.ProductoDAO;
import cl.advise.test.model.Producto;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductoDAO productoDAO;
	
	public int insert(Producto producto){
		return productoDAO.insert(producto);
	}
	
	public List<Producto> getProductList(){
		return productoDAO.findAll();
	}
	
}
