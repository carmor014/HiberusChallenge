package com.hiberus.services;

import java.util.List;

import com.hiberus.models.entities.Order;
import com.hiberus.models.entities.Product;

import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements IBillservice {

    @Override
    public void create(Order order) {
        List<Product> products = order.getProducts();

        float total_products = 0;

        for (Product product : products) {
            total_products += (product.getCost() * product.getQuantity());
        }

        System.out.println(total_products);

    }

}