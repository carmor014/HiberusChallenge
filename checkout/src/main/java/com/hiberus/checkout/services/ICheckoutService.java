package com.hiberus.checkout.services;

import com.hiberus.checkout.models.entitys.Order;

public interface ICheckoutService  {
	
	public String create(Order order);

}
