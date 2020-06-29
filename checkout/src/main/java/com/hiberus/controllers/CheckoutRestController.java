package com.hiberus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hiberus.models.entities.Order;
import com.hiberus.services.ICheckoutService;

@RestController
@RequestMapping("/api")
public class CheckoutRestController {
	
	@Autowired
	private ICheckoutService checkoutService;

	@GetMapping("/ping")
	public String index() {
		return "pong";
	}

	@PostMapping("/checkout")
	@ResponseStatus(HttpStatus.CREATED)
	public String create(@RequestBody Order order) {
		try {
			String response = checkoutService.sendOrder(order);
			return response;
		} catch (Exception e) {
			System.out.println(e);
			return "Execution failed";
		}
	}
}

