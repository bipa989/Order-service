package com.orderservice.service;


import com.orderservice.entity.OrderEntity;

import java.util.List;

public interface OrderService {

   OrderEntity saveUser(OrderEntity order);
   List<OrderEntity> getAll();
   OrderEntity getById(Long id);







}
