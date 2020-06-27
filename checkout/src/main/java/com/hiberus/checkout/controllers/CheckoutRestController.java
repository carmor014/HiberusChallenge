package com.hiberus.checkout.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hiberus.checkout.models.entitys.Order;
import com.hiberus.checkout.models.services.ICheckoutService;

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
			String response = checkoutService.create(order);
			return response;
		} catch (Exception e) {
			System.out.println(e);
			return "Execution failed";
		}
	}
}

