package com.example.demo.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "Customer")
public class Customer {

    @Id //主键
//    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")//自增
    private Integer customer_id;

    private Integer user_id;

    private String customer_name;

    private String customer_email;

    private String customer_address;

    private Double customer_phone;

    public Customer (){}
    public Customer(Integer customer_id,Integer user_id,String customer_name,String customer_email,String customer_address,Double customer_phone){
        this.customer_id = customer_id;
        this.user_id = user_id;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.customer_email = customer_email;
        this.customer_phone = customer_phone;
    }


}