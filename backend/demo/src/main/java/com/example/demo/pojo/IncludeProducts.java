package com.example.demo.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

//import javax.persistence.*;

@Data
@Table(name = "Includes_Product")
public class IncludeProducts {
    @Id //主键
    private Integer customer_id;

    private Integer product_id;

    private Integer quantity;

    private Double price;

    private Integer shoppingcart_id;

    public IncludeProducts (){}
    public IncludeProducts(Integer customer_id,Integer product_id, Integer quantity, Double price){
//        this.shoppingcart_id=shoppingcart_id;
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
