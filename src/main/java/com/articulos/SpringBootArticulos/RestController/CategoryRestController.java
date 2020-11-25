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

import com.articulos.SpringBootArticulos.Entity.Category;
import com.articulos.SpringBootArticulos.Service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryRestController 
{
	@Autowired
	private CategoryService service;
	
	@GetMapping("/all")
	public List<Category> getAll()
	{
		return service.getAll();
	}
	
	@GetMapping("/{category")
	public Category getById(@PathVariable int category)
	{
		return service.getById(category);
	}
	
	@PostMapping({"/new/{category}", "/edit/{category}"})
	public Category save(@PathVariable Category category)
	{
		service.save(category);
		return category;
	}
	
	@DeleteMapping("/delete/{category}")
	public void delete(@PathVariable int category)
	{
		Category cat = service.getById(category);
		
		if (cat != null) { throw new RuntimeException("Category id not found -"+category); } else { service.delete(cat); }
	}
}
