package com.articulos.SpringBootArticulos.DAO;

import java.util.List;

import com.articulos.SpringBootArticulos.Entity.Category;

public interface CategoryDAO 
{
	public List<Category> getAll();
	public Category getById(int category);
	public void save(Category category);
	public void delete(Category category);
	public void insert(Category category);
}
