package com.articulos.SpringBootArticulos.DAO;

import java.util.List;

import com.articulos.SpringBootArticulos.Entity.Item;

/* Methods that ItemDAOImpl will use to connect to the database. */
public interface ItemDAO 
{
	public List<Item> getAll();
	public List<Item> getByCategory(int category);
	public List<Item> getByProvider(int provider);
	public Item getById(int item);
	public void save(Item item);
	public void delete(Item item);
	public void insert(Item item);
}
