package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Component;
import com.example.demo.Entity.Product;
import com.example.demo.Service.ComponentService;
import com.example.demo.Service.ProductService;

@RestController
public class Controller {
	
	@Autowired
	private ProductService pservice;
	
	@PostMapping("/product")
	void createProduct(@RequestBody @Valid Product product)
	{
		pservice.createProduct(product);
	} 
	
	@Autowired
	private ComponentService cservice;
	@PostMapping("/component")
	void createComponent(@RequestBody @Valid Component component)
	{
		cservice.createComponent(component);
	}
}
