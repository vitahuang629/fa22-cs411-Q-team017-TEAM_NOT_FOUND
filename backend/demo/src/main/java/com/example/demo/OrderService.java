package com.example.demo;

import com.example.demo.mapper.PlaceOrderDAO;
import com.example.demo.pojo.CustomerOrder;
import com.example.demo.pojo.PlaceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private PlaceOrderDAO orderMapper;

    public CustomerOrder getOrderNum(Integer userId) {
        CustomerOrder list = orderMapper.getOrderByCustomerIdAgg(userId);
        return list;
    }

    public List<PlaceOrder> getOrder(Integer userId) {
        List<PlaceOrder> list = orderMapper.getOrderByCustomerId(userId);
        return list;
    }
}

