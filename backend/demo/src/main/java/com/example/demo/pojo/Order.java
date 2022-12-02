package com.example.demo.pojo;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@Table(name = "Place_Order")
public class Order {

    private Integer customer_id;
    private Integer order_id;
    private Date order_date;
    private float price;

    public Order (){}

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer_id=" + customer_id +
                ", order_id=" + order_id +
                ", order_date=" + order_date +
                ", price=" + price +
                '}';
    }
}
