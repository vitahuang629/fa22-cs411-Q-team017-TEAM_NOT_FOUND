package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductQuantity {
//    private List<Integer> product_id;
//    private List<Integer> quantity;

    private List<List<String>> product_quantity;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private Integer customer_id;
    private float price;

    public List<List<String>> getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(List<List<String>> product_quantity) {
        this.product_quantity = product_quantity;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public ProductQuantity(List<List<String>> product_quantity) {
        this.product_quantity = product_quantity;
    }

    public ProductQuantity() {
    }
}
