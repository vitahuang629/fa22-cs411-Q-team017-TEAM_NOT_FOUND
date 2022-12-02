package com.example.demo.pojo;

public class AddCart {
    private Integer product_id;
    private Integer product_price;

    private Integer customer_id;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getPrice() {
        return product_price;
    }

    public void setPrice(Integer product_price) {
        this.product_price = product_price;
    }
    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }


    public AddCart() {
    }
}
