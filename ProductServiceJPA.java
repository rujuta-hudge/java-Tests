package com.example.demo.Services;

import java.util.List;

import com.example.demo.DAO.ProductDao;
import com.example.demo.Pojo.Product;

public class ProductServiceJPA {
	ProductDao pd;
	
	public Product createproductService(Product p) {
		return this.pd.save(p);
	}
	
	public List<Product> getAllProductService() {
		return this.pd.findAll();
	}
	
	public int deleteproductService(String id) {
		try {
			this.pd.deleteById(id);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}

}
