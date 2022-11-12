package com.example.demo.pojo;

public class CustomerOrder {
    public CustomerOrder(String customer_name, int cnt) {
        this.customer_name = customer_name;
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "customer_name='" + customer_name + '\'' +
                ", cnt=" + cnt +
                '}';
    }

    public CustomerOrder(){}

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    private String customer_name;
    private int cnt;
}
