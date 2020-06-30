package com.hiberus.models.Dao;

import com.hiberus.models.entities.Delivery;

import org.springframework.data.repository.CrudRepository;

public interface IDeliveryDao extends CrudRepository<Delivery, Long> {
    
}