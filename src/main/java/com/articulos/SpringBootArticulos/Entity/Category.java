package com.articulos.SpringBootArticulos.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "category")
public class Category 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cat;
	
	private String description_cat;
	
	public Category(Integer id, String desc)
	{
		this.id_cat = id;
		this.description_cat = desc;
	}
	
	public Category() {}

	public Integer getId_cat() 
	{
		return id_cat;
	}

	public void setId_cat(Integer id_cat) 
	{
		this.id_cat = id_cat;
	}

	public String getDescription_cat() 
	{
		return description_cat;
	}

	public void setDescription_cat(String description_cat) 
	{
		this.description_cat = description_cat;
	}
	
	
}
