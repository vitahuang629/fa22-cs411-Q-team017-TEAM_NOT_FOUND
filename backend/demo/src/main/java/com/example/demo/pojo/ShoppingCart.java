package com.example.demo.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

//import javax.persistence.*;

@Data
@Table(name = "Has_ShoppingCart")
public class ShoppingCart {
    @Id //主键
//    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")//自增
    private Integer cart_customer_id;

    private Integer shoppingcart_id;

    private Integer total_price;

    public ShoppingCart (){}
    public ShoppingCart(Integer cart_customer_id,Integer shoppingcart_id,Integer total_price){
        this.cart_customer_id = cart_customer_id;
        this.shoppingcart_id = shoppingcart_id;
        this.total_price = total_price;
    }
}
