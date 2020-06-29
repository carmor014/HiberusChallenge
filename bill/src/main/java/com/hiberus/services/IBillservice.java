package com.hiberus.services;

import java.util.List;

import com.hiberus.models.entities.Bill;
import com.hiberus.models.entities.Order;

public interface IBillservice {
    
    public void create(Order order);	

}