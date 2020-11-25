package com.articulos.SpringBootArticulos.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.articulos.SpringBootArticulos.DAO.ProviderDAO;
import com.articulos.SpringBootArticulos.Entity.Provider;

@Repository
public class ProviderDAOImpl implements ProviderDAO
{
	@Autowired
	private EntityManager em;

	@Override
	public List<Provider> getAll() 
	{
		Session session = em.unwrap(Session.class);
		Query<Provider> query = session.createQuery("from provider", Provider.class);
		return query.getResultList();
	}

	@Override
	public Provider getById(int provider) 
	{
		Session session = em.unwrap(Session.class);
		return session.get(Provider.class, provider);
	}

	@Override
	public void save(Provider provider) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(provider);
	}

	@Override
	public void delete(Provider provider) 
	{
		Session session = em.unwrap(Session.class);
		session.delete(provider);
		
	}

	@Override
	public void insert(Provider provider) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(provider);	
	}
}
