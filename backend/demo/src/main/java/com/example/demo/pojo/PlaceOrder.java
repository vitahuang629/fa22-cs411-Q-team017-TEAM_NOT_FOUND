package com.example.demo.pojo;

import java.util.Date;

public class PlaceOrder {
    private int order_id;
    private int customer_id;
    private java.sql.Date order_date;
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public java.sql.Date getDate() {
        return order_date;
    }

    public void setDate(java.sql.Date date) {
        this.order_date = order_date;
    }

    @Override
    public String toString() {
        return "PlaceOrder{" +
                "order_id=" + order_id +
                ", customer_id=" + customer_id +
                ", order_date=" + order_date +
                ", price=" + price +
                '}';
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public PlaceOrder(int order_id, int customer_id) {
        this.order_id = order_id;
        this.customer_id = customer_id;
    }
    public PlaceOrder(int order_id, int customer_id, java.sql.Date order_date, float price) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.order_date = order_date;
        this.price = price;
    }
    public PlaceOrder(int order_id) {
        this.order_id = order_id;
    }
    public PlaceOrder(){
    }
}
