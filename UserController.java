package com.example.demo.Controllers;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Pojo.Product;
import com.example.demo.Pojo.User;

@RestController
@RequestMapping("product")
public class UserController {
	
	private ArrayList<Product> productarr = new ArrayList<>();
	
	@PostMapping("add")
	public Product createUser(@RequestBody Product pr) {
		this.productarr.add(pr);
		return pr;
	}
	
	@GetMapping("all")
	public  ArrayList<Product> getallproducts(){
		return this.productarr;
		
	}
	
	@DeleteMapping("delete/{id}")
	public Boolean deleteProduct(@PathVariable("id") String id) {
		for(Product p: productarr) {
			if(p.getId()==id) {
				return productarr.remove(p);
		}
			
	}
		return false;
}
}

