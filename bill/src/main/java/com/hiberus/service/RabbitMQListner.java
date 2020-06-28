package com.hiberus.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.hiberus.models.entities.Order;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.utils.SerializationUtils;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQListner implements MessageListener {

	public void onMessage(Message message) {

		try {

			ByteArrayInputStream bis = new ByteArrayInputStream(message.getBody());
			ObjectInput in = new ObjectInputStream(bis);
			Order order = (Order) in.readObject();
			in.close();

		} catch (Exception e) {
			System.out.println("Internal error");
		}
	}

}
