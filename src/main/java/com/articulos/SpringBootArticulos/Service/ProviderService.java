package com.articulos.SpringBootArticulos.Service;

import java.util.List;

import com.articulos.SpringBootArticulos.Entity.Provider;

public interface ProviderService 
{
	public List<Provider> getAll();
	public Provider getById(int provider);
	public void save(Provider provider);
	public void delete(Provider provider);
	public void insert(Provider provider);
}
