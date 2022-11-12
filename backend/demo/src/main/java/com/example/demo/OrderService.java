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

    public List<CustomerOrder> getOrder(Integer userId) {
        List<CustomerOrder> list = orderMapper.getOrderByCustomerId(userId);
        return list;
    }
}

