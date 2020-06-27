package com.hiberus.checkout.models.services;

import org.springframework.stereotype.Service;

import com.hiberus.checkout.models.entitys.Order;

@Service
public class CheckoutServiceImpl implements ICheckoutService{

	@Override
	public String create(Order order) {
		// the next code
		return "Order received";
	}
	
	

}
