package com.ss.assignment.orderservice;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer>{
    
}
