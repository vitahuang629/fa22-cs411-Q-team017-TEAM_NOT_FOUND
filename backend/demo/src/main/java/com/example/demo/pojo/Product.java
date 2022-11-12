package com.example.demo.pojo;

import org.springframework.jdbc.core.JdbcTemplate;



public class Product {

    private int product_id;
    private String product_name;
    private double product_price;
    private int stock_num;
    private String product_description;

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                ", stock_num=" + stock_num +
                ", product_description='" + product_description + '\'' +
                ", farmer_id=" + farmer_id +
                '}';
    }

    public Product(int product_id) {
        this.product_id = product_id;
    }

    private int farmer_id;

    public int getFarmer_id() {
        return farmer_id;
    }

    public void setFarmer_id(int farmer_id) {
        this.farmer_id = farmer_id;
    }

    public Product(){
    }

    public Product(String product_name, double product_price, int stock_num, String product_description,int farmer_id) {
        this.product_name = product_name;
        this.product_price = product_price;
        this.stock_num = stock_num;
        this.product_description = product_description;
        this.farmer_id=farmer_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public int getStock_num() {
        return stock_num;
    }

    public void setStock_num(int stock_num) {
        this.stock_num = stock_num;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

}
