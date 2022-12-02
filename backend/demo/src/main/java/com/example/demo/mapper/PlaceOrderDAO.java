package com.example.demo.mapper;

import com.example.demo.pojo.CustomerOrder;
import com.example.demo.pojo.PlaceOrder;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PlaceOrderDAO {
    @Select("select * from Place_Order")
    List<PlaceOrder> getOrderIds();

    @Insert("insert into Place_Order(order_id,customer_id,order_date,price) values(#{order_id},#{customer_id},#{order_date},#{price})")
    void insertOrder(PlaceOrder placeorder);

    @Select("SELECT COUNT(order_id) AS cnt,customer_name FROM Place_Order NATURAL JOIN Customer WHERE customer_id=#{customer_id}")
    CustomerOrder getOrderByCustomerIdAgg(Integer customer_id);

    @Select("SELECT * FROM Place_Order WHERE customer_id=#{customer_id}")
    List<PlaceOrder> getOrderByCustomerId(Integer customer_id);

    @Select("SELECT * FROM Place_Order WHERE order_id=#{order_id}")
    PlaceOrder getOrderById(Integer order_id);

    @Delete("DELETE FROM Place_Order WHERE order_id=#{order_id}")
    void deleteOne(Integer order_id);

    @Select("select Order_status from NewTable where Customer_id=#{customer_id};")
    String getStatus(Integer customer_id);
}