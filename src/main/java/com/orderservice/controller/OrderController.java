package com.orderservice.controller;

import com.orderservice.entity.OrderEntity;
import com.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
@Autowired
    private OrderService orderService;
@PostMapping("/save")
public OrderEntity saveOrder(@RequestBody OrderEntity order) {
  OrderEntity  os =orderService.saveUser(order);
  return os;
 }

 @GetMapping("/all")
 public List<OrderEntity>  getAll(){
   List < OrderEntity>  all = orderService.getAll();
return  all;
 }
 @GetMapping("/{id}")
 public OrderEntity getById(@PathVariable Long id){
   return  orderService.getById(id);

            }


}
