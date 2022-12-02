package com.example.demo.pojo;

public class Contains {
    private Integer product_id;
    private Integer order_id;
    private Integer quantity;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "Contains{" +
                "product_id=" + product_id +
                ", order_id=" + order_id +
                ", quantity=" + quantity +
                '}';
    }

    public Contains(Integer product_id, Integer order_id, Integer quantity) {
        this.product_id = product_id;
        this.order_id = order_id;
        this.quantity = quantity;
    }

    public Contains() {
    }

    public Contains(Integer product_id, Integer order_id) {
        this.product_id = product_id;
        this.order_id = order_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
