package com.example.demo.mapper;

import com.example.demo.pojo.Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CustomerDAO {
    @Select("select * from Customer")
    List<Customer> list();

    @Select("select customer_name from Customer where customer_id=#{customer_id}")
    String getCustomerById(Integer customer_id);

    @Insert("insert into Customer values(#{customer_id},#{user_id},#{customer_name},#{customer_email},#{customer_address},#{customer_phone} )")
    void insertCustomer(Customer Customer);

    @Update("update Customer set customer_id=#{customer_id}, user_id=#{user_id}, customer_email=#{customer_email}, customer_address=#{customer_address}, customer_phone=#{customer_phone} where customer_id=#{customer_id}")
    void updateCustomerInfo(Customer customer);

    @Delete("delete from Customer where customer_id=#{customer_id}")
    int deleteOne(Integer customer_id);
}
