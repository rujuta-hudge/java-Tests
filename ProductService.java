package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.Pojo.Product;

public class ProductService {
	
	private ArrayList<Product> productarr = new ArrayList<>();	
	
	
	public Product createUserService(Product p) {
		Product productToCreate = new Product(p.getName(), p.getName(), p.getPrice(), p.getDescription());
		
		this.productarr.add(productToCreate);
		return productToCreate;
	}
	
	public ArrayList<Product> getAllProductService() {
		return this.productarr;
	}
	
	public Boolean deleteproductService(String id) {
		for (Product pr : productarr) {
			if(pr.getId()==id) {
				return productarr.remove(pr);
			}
		}
		return false;
	}
	
	

}
