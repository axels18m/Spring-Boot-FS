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

import com.articulos.SpringBootArticulos.Entity.Item;
import com.articulos.SpringBootArticulos.Service.ItemService;

//@RestController
//@RequestMapping("/item")
public class ItemRestController 
{
	@Autowired
	private ItemService service;
	
	@GetMapping("/all")
	public List<Item> getAll()
	{
		return service.getAll();
	}
	
	@GetMapping("/{itemId}")
	public Item getById(@PathVariable int item)
	{
		return service.getById(item);
	}
	
	@GetMapping("/category/{itemId}")
	public List<Item> getByCategory(@PathVariable int item)
	{
		return service.getByCategory(item);
	}
	
	@GetMapping("/provider/{itemId}")
	public List<Item>  getByProvider(@PathVariable int item)
	{
		return service.getByProvider(item);
	}
	
	@DeleteMapping("/delete/{item}")
	public void delete(@PathVariable int itemId)
	{
		Item item = service.getById(itemId);
		
		if (item == null) { throw new RuntimeException("Item id not found -"+itemId); } else { service.delete(item); }
	}
	
	@PostMapping({"/new/{item}", "/edit/{item}"})
	public void save(@PathVariable Item item)
	{
		service.save(item);
	}
}
