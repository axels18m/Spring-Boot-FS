package com.articulos.SpringBootArticulos.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.articulos.SpringBootArticulos.Entity.Provider;
import com.articulos.SpringBootArticulos.Service.ProviderService;

@RestController
@RequestMapping("/provider")
public class ProviderRestController 
{
	@Autowired
	private ProviderService service;
	
	@GetMapping("/all")
	public List<Provider> getAll()
	{
		return service.getAll();
	}
	
	@GetMapping("/{provider}")
	public Provider getById(@PathVariable int provider)
	{
		return service.getById(provider);
	}
	
	@PostMapping({"/save/{provider}", "/edit/{provider}"})
	public Provider save(@PathVariable Provider provider)
	{
		service.save(provider);
		return provider;
	}
	
	@DeleteMapping("/delete/{item}")
	public void delete(@PathVariable int provider)
	{
		Provider prov = service.getById(provider);
		
		if (prov != null) { throw new RuntimeException("Category id not found -"+provider); } else { service.delete(prov); }
	}
	
	
}
