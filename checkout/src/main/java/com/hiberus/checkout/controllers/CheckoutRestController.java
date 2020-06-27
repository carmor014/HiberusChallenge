package com.hiberus.checkout.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hiberus.checkout.models.entitys.Order;

@RestController
@RequestMapping("/api")
public class CheckoutRestController {

	@GetMapping("/ping")
	public String index() {
		return "pong";
	}

	@PostMapping("/checkout")
	@ResponseStatus(HttpStatus.CREATED)
	public String create(@RequestBody Order order) {
		try {
			return "Order received";
		} catch (Exception e) {
			System.out.println(e);
			return "Execution failed";
		}
	}
}
