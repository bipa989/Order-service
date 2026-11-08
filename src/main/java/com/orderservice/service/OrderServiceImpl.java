package com.orderservice.service;

import com.orderservice.entity.OrderEntity;
import com.orderservice.exception.OrderNotFoundException;
import com.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepo;


    @Override
    public OrderEntity saveUser(OrderEntity order) {
     OrderEntity t= orderRepo.save(order);

        return t;
    }

    @Override
    public List<OrderEntity> getAll() {
       List  <OrderEntity> find   = orderRepo.findAll();
        return find;

    }


    @Override
    public OrderEntity getById(Long id) {

        return orderRepo.findById(id).orElseThrow(() -> new OrderNotFoundException("Order not found with id: " + id));


    }
    }
