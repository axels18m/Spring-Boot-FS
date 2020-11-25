package com.articulos.SpringBootArticulos.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.articulos.SpringBootArticulos.DAO.ItemDAO;
import com.articulos.SpringBootArticulos.Entity.Item;

@Repository /* Tell us that it's a DAO */
public class ItemDAOImpl implements ItemDAO
{
	@Autowired /* We inject the dependency EM */
	private EntityManager em;

	@Override
	public List<Item> getAll() 
	{
		Session session = em.unwrap(Session.class);
		Query<Item> query = session.createQuery("from item", Item.class);
		return query.getResultList();
	}

	@Override
	public List<Item> getByCategory(int category) 
	{
		Session session = em.unwrap(Session.class);
		Query<Item> query = session.createQuery("from item where category_item=" + category, Item.class);
		return query.getResultList();
	}

	@Override
	public List<Item> getByProvider(int provider) 
	{
		Session session = em.unwrap(Session.class);
		Query<Item> query = session.createQuery("from item where provider_item=" + provider, Item.class);
		return query.getResultList();
	}

	@Override
	public Item getById(int id) 
	{
		Session session = em.unwrap(Session.class);
		Item item = session.get(Item.class, id);
		return null;
	}

	@Override
	public void save(Item item) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(item);
	}

	@Override
	public void delete(Item item) 
	{
		Session session = em.unwrap(Session.class);
		session.delete(item);
	}

	@Override
	public void insert(Item item) 
	{
		Session session = em.unwrap(Session.class);
		session.delete(item);
	}
	
	
}
