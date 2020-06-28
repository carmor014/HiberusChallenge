package com.hiberus.checkout.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQFanoutConfig {

	@Bean
	Queue billQueue() {
		return new Queue("billQueue", false);
	}

	@Bean
	Queue logisticQueue() {
		return new Queue("logisticQueue", false);
	}


	@Bean
	FanoutExchange exchange() {
		return new FanoutExchange("fanout-exchange");
	}

	@Bean
	Binding billBinding(Queue billQueue, FanoutExchange exchange) {
		return BindingBuilder.bind(billQueue).to(exchange);
	}



	@Bean
	Binding logisticBinding(Queue logisticQueue, FanoutExchange exchange) {
		return BindingBuilder.bind(logisticQueue).to(exchange);
	}

}