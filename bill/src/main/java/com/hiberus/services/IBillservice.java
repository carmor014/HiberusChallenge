package com.hiberus.services;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hiberus.models.entities.Bill;
import com.hiberus.models.entities.Order;

public interface IBillservice {
    
    public void create(Order order) throws JsonProcessingException;	

}