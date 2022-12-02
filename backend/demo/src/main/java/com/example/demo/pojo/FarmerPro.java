package com.example.demo.pojo;

public class FarmerPro {

    private int farmer_id;
    private int rank;
    private String product_name;
    private double product_price;
    private double avgsales;

    @Override
    public String toString() {
        return "farmerpro{" +
                "farmer_id=" + farmer_id +
                ", rank=" + rank +
                ", product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                ", avgsales=" + avgsales +
                '}';
    }

    public FarmerPro(int farmer_id, int rank, String product_name, double product_price, double avgsales) {
        this.farmer_id = farmer_id;
        this.rank = rank;
        this.product_name = product_name;
        this.product_price = product_price;
        this.avgsales = avgsales;
    }

    public int getFarmer_id() {
        return farmer_id;
    }

    public void setFarmer_id(int farmer_id) {
        this.farmer_id = farmer_id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
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

    public double getAvgsales() {
        return avgsales;
    }

    public void setAvgsales(double avgsales) {
        this.avgsales = avgsales;
    }
}
