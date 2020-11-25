package com.articulos.SpringBootArticulos.Service;

import java.util.List;

import com.articulos.SpringBootArticulos.Entity.Item;

public interface ItemService 
{
	public List<Item> getAll();
	public List<Item> getByCategory(int category);
	public List<Item> getByProvider(int provider);
	public Item getById(int item);
	public void save(Item item);
	public void delete(Item item);
	public void insert(Item item);
}
