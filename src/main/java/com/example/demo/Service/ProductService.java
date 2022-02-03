package com.example.demo.Service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Repo.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository prepo;
	
	public void createProduct(@Valid Product product) {
		// TODO Auto-generated method stub
		prepo.save(product);
	}

}
