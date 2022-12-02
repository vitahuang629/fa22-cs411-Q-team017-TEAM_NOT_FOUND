package com.example.demo.pojo;

public class FarmerRank {
    private int farmer_id;

    private int rank_1;
    private String product_name;
    private double product_price;
    private int sum1;

    public FarmerRank(){

    }

    @Override
    public String toString() {
        return "FarmerRank{" +
                "farmer_id=" + farmer_id +
                ", rank_1=" + rank_1 +
                ", product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                ", sum1=" + sum1 +
                '}';
    }

    public FarmerRank(int farmer_id, int rank_1, String product_name, double product_price, int sum1) {
        this.farmer_id = farmer_id;
        this.rank_1 = rank_1;
        this.product_name = product_name;
        this.product_price = product_price;
        this.sum1 = sum1;
    }

    public int getFarmer_id() {
        return farmer_id;
    }

    public void setFarmer_id(int farmer_id) {
        this.farmer_id = farmer_id;
    }

    public int getRank_1() {
        return rank_1;
    }

    public void setRank_1(int rank_1) {
        this.rank_1 = rank_1;
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

    public int getSum1() {
        return sum1;
    }

    public void setSum1(int sum1) {
        this.sum1 = sum1;
    }
}
