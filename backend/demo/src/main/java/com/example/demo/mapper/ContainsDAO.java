package com.example.demo.mapper;

import com.example.demo.pojo.Contains;
import com.example.demo.pojo.PlaceOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ContainsDAO {
    @Select("select product_id from Contains WHERE order_id=#{order_id}")
    List<Contains> getProductIds(Integer productId);

    @Insert("insert into Contains(order_id,product_id,quantity) values(#{order_id},#{product_id},#{quantity})")
    void insertContains(Contains contains);
}