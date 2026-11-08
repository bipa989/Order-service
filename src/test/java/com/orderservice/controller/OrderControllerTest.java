package com.orderservice.controller;


import com.orderservice.entity.OrderEntity;
import com.orderservice.service.OrderService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
public class OrderControllerTest {


        @Mock
        private OrderService orderService;

        @InjectMocks
        private OrderController orderController;


        // Test 1: Save Order
        @Test
        void testSaveOrder() {

            OrderEntity order = new OrderEntity();

            when(orderService.saveUser(order))
                    .thenReturn(order);

            OrderEntity result = orderController.saveOrder(order);

            assertNotNull(result);
            assertSame(order, result);

            verify(orderService, times(1)).saveUser(order);
        }


        // Test 2: Get All Orders
        @Test
        void testGetAllOrders() {

            OrderEntity order1 = new OrderEntity();
            OrderEntity order2 = new OrderEntity();

            List<OrderEntity> orders = List.of(order1, order2);

            when(orderService.getAll())
                    .thenReturn(orders);

            List<OrderEntity> result = orderController.getAll();

            assertNotNull(result);
            assertEquals(2, result.size());

            verify(orderService, times(1)).getAll();
        }


        // Test 3: Get Order By ID
        @Test
        void testGetOrderById() {

            Long id = 1L;

            OrderEntity order = new OrderEntity();

            when(orderService.getById(id))
                    .thenReturn(order);

            OrderEntity result = orderController.getById(id);

            assertNotNull(result);
            assertSame(order, result);

            verify(orderService, times(1)).getById(id);
        }

    }


