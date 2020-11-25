package com.articulos.SpringBootArticulos.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name = "item")
public class Item 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_item;
	
	private String name_item;
	private String description_item;
	private Float price_item;
	private Integer category_item;
	private Integer provider_item;
	
	public Item(Integer id, String name, String description, Float price, Integer cat, Integer prov)
	{
		this.id_item = id;
		this.name_item = name;
		this.description_item = description;
		this.price_item = price;
		this.category_item = cat;
		this.provider_item = prov;
	}
	
	public Item() {}

	public Integer getId_Item() 
	{
		return id_item;
	}

	public void setId_item(Integer id_item) 
	{
		this.id_item = id_item;
	}

	public String getName_Item() 
	{
		return name_item;
	}

	public void setName_Item(String name_item) 
	{
		this.name_item = name_item;
	}

	public String getDescription_Item() 
	{
		return description_item;
	}

	public void setDescription_Item(String description_item) 
	{
		this.description_item = description_item;
	}

	public Float getPrice_Item() 
	{
		return price_item;
	}

	public void setPrice_Item(Float price_item) 
	{
		this.price_item = price_item;
	}

	public Integer getCategory_Item() 
	{
		return category_item;
	}

	public void setCategory_Item(Integer category_item) 
	{
		this.category_item = category_item;
	}

	public Integer getProvider_Item() 
	{
		return provider_item;
	}

	public void setProvider_Item(Integer provider_item) 
	{
		this.provider_item = provider_item;
	}
}
