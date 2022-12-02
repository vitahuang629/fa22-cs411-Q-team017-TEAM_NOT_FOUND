package com.example.demo.mapper;

import com.example.demo.pojo.ShoppingCart;
import com.example.demo.pojo.IncludeProducts;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ShoppingCartDao {

    @Insert("insert into Has_ShoppingCart(cart_customer_id,shoppingcart_id,total_price) values(#{cart_customer_id},#{shoppingcart_id}),#{total_price}")
    void insertOne(ShoppingCart shoppingCart);

}

