package com.hiberus.models.Dao;

import com.hiberus.models.entities.Bill;

import org.springframework.data.repository.CrudRepository;

public interface IBillDao extends CrudRepository<Bill, Long> {
    
}