package com.example.demo;

import com.example.demo.mapper.ContainsDAO;
import com.example.demo.pojo.Contains;
import com.example.demo.pojo.CustomerOrder;
import com.example.demo.pojo.PlaceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContainsService {

    @Autowired
    private ContainsDAO containMapper;

    public List<Contains> getProduct(Integer productId) {
        List<Contains> list = containMapper.getProductIds(productId);
        return list;
    }

//    public void insertOrder()
}
