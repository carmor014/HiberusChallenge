package com.hiberus.services;

import com.hiberus.models.entities.Order;

public interface ICheckoutService  {
	
	public String sendOrder(Order order);

}
