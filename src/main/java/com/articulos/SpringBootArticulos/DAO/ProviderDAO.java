package com.articulos.SpringBootArticulos.DAO;

import java.util.List;

import com.articulos.SpringBootArticulos.Entity.Provider;

public interface ProviderDAO 
{
	public List<Provider> getAll();
	public Provider getById(int provider);
	public void save(Provider provider);
	public void delete(Provider provider);
	public void insert(Provider provider);
}
