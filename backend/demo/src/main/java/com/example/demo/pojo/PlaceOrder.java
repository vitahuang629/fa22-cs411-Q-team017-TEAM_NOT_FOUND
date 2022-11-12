package com.example.demo.pojo;

import java.util.Date;

public class PlaceOrder {
    private int order_id;
    private int customer_id;
    private Date date;
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
    public PlaceOrder(int order_id, int customer_id, Date date, float price) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.date = date;
        this.price = price;
    }

    public PlaceOrder(){
    }
}
