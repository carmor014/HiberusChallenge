package com.hiberus.services;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hiberus.models.Dao.IDeliveryDao;
import com.hiberus.models.entities.Delivery;
import com.hiberus.models.entities.Order;
import com.hiberus.models.entities.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LogisticServiceImpl implements ILogisticservice {

    @Autowired
    private IDeliveryDao deliveryDao;

    @Override
    public void create(Order order) throws JsonProcessingException {
        List<Product> products = order.getProducts();

        Delivery delivery = new Delivery();

        delivery.setClientId(order.getClientId());
        Date currentDate = new Date();
        delivery.setDeliveryDate(currentDate);
        delivery.setAddress(order.getDirection());     
        
        ObjectMapper Obj = new ObjectMapper();
        String jsonStrProducts = Obj.writeValueAsString(products);

        delivery.setProducts(jsonStrProducts);

        deliveryDao.save(delivery);

    }
    
}