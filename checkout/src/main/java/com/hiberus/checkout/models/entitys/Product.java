package com.hiberus.checkout.models.entitys;

import java.io.Serializable;

public class Product implements Serializable {
	
	
	private Long id;
	private int quantity;
	private double cost;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

}
