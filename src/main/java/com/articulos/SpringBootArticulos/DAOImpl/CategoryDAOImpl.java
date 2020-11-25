package com.articulos.SpringBootArticulos.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.articulos.SpringBootArticulos.DAO.CategoryDAO;
import com.articulos.SpringBootArticulos.Entity.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO
{
	@Autowired
	private EntityManager em;

	@Override
	public List<Category> getAll() 
	{
		Session session = em.unwrap(Session.class);
		Query<Category> query = session.createQuery("from category", Category.class);
		return query.getResultList();
	}

	@Override
	public Category getById(int category) 
	{
		Session session = em.unwrap(Session.class);
		return session.get(Category.class, category);
	}

	@Override
	public void save(Category category) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(category);
	}

	@Override
	public void delete(Category category) 
	{
		Session session = em.unwrap(Session.class);
		session.delete(category);
	}

	@Override
	public void insert(Category category) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(category);		
	}
}
