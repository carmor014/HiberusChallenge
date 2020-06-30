package com.hiberus.services;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hiberus.models.Dao.IBillDao;
import com.hiberus.models.entities.Bill;
import com.hiberus.models.entities.Order;
import com.hiberus.models.entities.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BillServiceImpl implements IBillservice {

    @Autowired
    private IBillDao billdao;

    @Override
    public void create(Order order) throws JsonProcessingException {
        List<Product> products = order.getProducts();

        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += (product.getCost() * product.getQuantity());
        }

        Bill bill = new Bill();

        bill.setClientId(order.getClientId());
        bill.setTotal(totalAmount);
        bill.setCreatedAt(order.getDate());
        
        ObjectMapper Obj = new ObjectMapper();
        String jsonStrProducts = Obj.writeValueAsString(products);

        bill.setProducts(jsonStrProducts);

        billdao.save(bill);

    }
    
}