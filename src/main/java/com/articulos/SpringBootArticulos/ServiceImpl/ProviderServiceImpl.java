package com.articulos.SpringBootArticulos.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.articulos.SpringBootArticulos.DAO.ProviderDAO;
import com.articulos.SpringBootArticulos.Entity.Provider;
import com.articulos.SpringBootArticulos.Service.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService
{
	@Autowired
	private ProviderDAO dao;
	
	@Override
	public List<Provider> getAll() 
	{
		return dao.getAll();
	}

	@Override
	public Provider getById(int provider) 
	{
		return dao.getById(provider);
	}

	@Override
	public void save(Provider provider) 
	{
		dao.save(provider);
	}

	@Override
	public void delete(Provider provider) 
	{
		dao.delete(provider);	
	}

	@Override
	public void insert(Provider provider) 
	{
		dao.insert(provider);	
	}

}
