package com.example.demo.mapper;

import com.example.demo.pojo.Order;
import com.example.demo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public OrderDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Order> listOrder(){
        String sql = "Select * From Place_Order";
        List<Order> listOrder = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Order.class));
        return listOrder;
    }
}
