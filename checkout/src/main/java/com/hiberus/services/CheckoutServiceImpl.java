package com.hiberus.services;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.hiberus.models.entities.Order;

@Service
public class CheckoutServiceImpl implements ICheckoutService{

	
	@Value("${hiberus.rabbitmq.exchange}")
	private String exchange;
	
	@Autowired
	private AmqpTemplate amqpTemplate;


	@Override
	public String create(Order order) {
		amqpTemplate.convertAndSend(exchange, "", order);
		System.out.println("Send msg = " + order);
		return "Order received";
	}
	
	

}
