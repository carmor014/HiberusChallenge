package com.hiberus.components;

import com.hiberus.models.entities.Order;
import com.hiberus.services.ILogisticservice;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class LogisticComponent {

    final ILogisticservice iLogisticService;

    public LogisticComponent(ILogisticservice iLogisticService) {
        this.iLogisticService = iLogisticService;
    }

    @RabbitListener(queues = "${hiberus.rabbitmq.logistic.queue}")
    public void create(Order order) {

        try {
            System.out.println("");
            iLogisticService.create(order);

        } catch (Exception e) {
            System.out.println("Internal error");
        }

    }
}
