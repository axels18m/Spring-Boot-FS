package com.articulos.SpringBootArticulos.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "provider")
public class Provider 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_prov;
	
	private String employee_prov;
	private String company_prov;
	private String phone_prov;
	private Integer amount_prov;
	
	public Provider(Integer id, String employee, String company, String phone, Integer amount)
	{
		this.id_prov = id;
		this.employee_prov = employee;
		this.company_prov = company;
		this.phone_prov = phone;
		this.amount_prov = amount;
	}
	
	public Provider() {}

	public Integer getId_prov() 
	{
		return id_prov;
	}

	public void setId_prov(Integer id_prov) 
	{
		this.id_prov = id_prov;
	}

	public String getEmployee_prov() 
	{
		return employee_prov;
	}

	public void setEmployee_prov(String employee_prov) 
	{
		this.employee_prov = employee_prov;
	}

	public String getCompany_prov() 
	{
		return company_prov;
	}

	public void setCompany_prov(String company_prov) 
	{
		this.company_prov = company_prov;
	}

	public String getPhone_prov() 
	{
		return phone_prov;
	}

	public void setPhone_prov(String phone_prov) 
	{
		this.phone_prov = phone_prov;
	}

	public Integer getAmount_prov() 
	{
		return amount_prov;
	}

	public void setAmount_prov(Integer amount_prov) 
	{
		this.amount_prov = amount_prov;
	}
}
