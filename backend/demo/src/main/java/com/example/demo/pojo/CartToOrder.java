package com.example.demo.pojo;

import java.util.List;

public class CartToOrder {
    private List<IncludeProducts> includeProductsList;
    private Double total_price;

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }


    public void setProduct_quantity(List<IncludeProducts> includeProductsList) {
        this.includeProductsList = includeProductsList;
    }
    public List<IncludeProducts> getProduct_quantity() {
        return includeProductsList;
    }




    public CartToOrder() {
    }
    public CartToOrder(List<IncludeProducts> includeProductsList, Double total_price) {
        this.includeProductsList = includeProductsList;
        this.total_price = total_price;
    }

    @Override
    public String toString() {
        return "CartToOrder{" +
                "includeProductsList=" + includeProductsList +
                ", total_price=" + total_price +
                '}';
    }
}
