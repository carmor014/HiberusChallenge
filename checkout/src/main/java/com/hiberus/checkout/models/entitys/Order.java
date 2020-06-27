package com.hiberus.checkout.models.entitys;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {
	
	
	

	private Long id;
	
	private Date date;
	
	private String direction;
	
	private  List<Product> products;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

}
