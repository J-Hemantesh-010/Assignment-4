package com.example.demo.Service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Component;
import com.example.demo.Repo.ComponentReppository;

@Service
public class ComponentService {
	
	@Autowired
	private ComponentReppository crepo;

	public void createComponent(@Valid Component component) {
		// TODO Auto-generated method stub
		crepo.save(component);
	}

}
