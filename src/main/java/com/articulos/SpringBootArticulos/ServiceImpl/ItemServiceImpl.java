package com.articulos.SpringBootArticulos.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.articulos.SpringBootArticulos.DAO.ItemDAO;
import com.articulos.SpringBootArticulos.Entity.Item;
import com.articulos.SpringBootArticulos.Service.ItemService;

@Service
public class ItemServiceImpl implements ItemService
{
	@Autowired
	private ItemDAO dao;

	@Override
	public List<Item> getAll() 
	{
		List<Item> items = dao.getAll();
		return items;
	}

	@Override
	public List<Item> getByCategory(int category) 
	{
		return dao.getByCategory(category);
	}

	@Override
	public List<Item> getByProvider(int provider) 
	{
		return dao.getByProvider(provider);
	}

	@Override
	public Item getById(int item) 
	{
		return dao.getById(item);
	}

	@Override
	public void save(Item item) 
	{
		dao.save(item);
	}

	@Override
	public void delete(Item item) 
	{
		dao.delete(item);	
	}

	@Override
	public void insert(Item item) 
	{
		dao.insert(item);	
	}

}
