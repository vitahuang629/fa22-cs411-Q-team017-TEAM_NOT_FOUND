package com.example.demo.mapper;

import com.example.demo.pojo.Customer;
import com.example.demo.pojo.IncludeProducts;
import com.example.demo.pojo.ShoppingCart;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IncludeProductsDao {
    @Select("select * from Includes_Product where customer_id=#{customer_id}")
    List<IncludeProducts> list(Integer customer_id);

    @Insert("insert into Includes_Product(customer_id,product_id,quantity,price) values(#{customer_id},#{product_id},#{quantity},#{price})")
    void insertProduct(IncludeProducts includeProducts);


    @Delete("DELETE FROM Includes_Product WHERE product_id=#{product_id}")
    void deleteOne(Integer product_id);

    @Delete("DELETE FROM Includes_Product WHERE customer_id=#{customer_id}")
    void clear(Integer customer_id);

    @Update("update Includes_Product set quantity=#{quantity} where product_id=#{product_id}")
    void updateOne(Integer product_id, Integer quantity);

    @Select("select * from Includes_Product where product_id=#{product_id}")
    IncludeProducts selectOne(Integer product_id);
}

