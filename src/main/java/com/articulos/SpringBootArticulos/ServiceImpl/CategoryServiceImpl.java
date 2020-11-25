package com.articulos.SpringBootArticulos.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.articulos.SpringBootArticulos.DAO.CategoryDAO;
import com.articulos.SpringBootArticulos.Entity.Category;
import com.articulos.SpringBootArticulos.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService
{
	
	@Autowired
	private CategoryDAO dao;

	@Override
	public List<Category> getAll() 
	{
		List<Category> categories = dao.getAll();
		return categories;
	}

	@Override
	public Category getById(int category) 
	{
		return dao.getById(category);
	}

	@Override
	public void save(Category category) 
	{
		dao.save(category);	
	}

	@Override
	public void delete(Category category) 
	{
		dao.delete(category);	
	}

	@Override
	public void insert(Category category) 
	{
		dao.insert(category);	
	}
	
}
