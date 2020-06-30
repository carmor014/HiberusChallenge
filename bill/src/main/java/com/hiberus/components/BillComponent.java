package com.hiberus.components;

import com.hiberus.models.entities.Order;
import com.hiberus.services.IBillservice;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class BillComponent {

    final IBillservice iBillservice;

    public BillComponent(IBillservice iBillservice) {
        this.iBillservice = iBillservice;
    }

    @RabbitListener(queues = "${hiberus.rabbitmq.bill.queue}")
    public void create(Order order) {

        try {
            System.out.println("");
            iBillservice.create(order);

        } catch (Exception e) {
            System.out.println("Internal error");
        }

    }
}
