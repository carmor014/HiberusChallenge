package com.hiberus.services;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.hiberus.models.entities.Order;

public interface ILogisticservice {
    
    public void create(Order order) throws JsonProcessingException;	

}