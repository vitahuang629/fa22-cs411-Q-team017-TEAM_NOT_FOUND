package com.example.demo.pojo;


public class Farmer {


    private int farmer_id;
    private int user_id;
    private String farmer_name;
    private String farmer_email;
    private double farmer_phone;

    public Farmer(){

    }

    public Farmer(int user_id, String farmer_name, String farmer_email, double farmer_phone) {
        this.user_id = user_id;
        this.farmer_name = farmer_name;
        this.farmer_email = farmer_email;
        this.farmer_phone = farmer_phone;
    }

    public int getFarmer_id() {
        return farmer_id;
    }

    public void setFarmer_id(int farmer_id) {
        this.farmer_id = farmer_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFarmer_name() {
        return farmer_name;
    }

    public void setFarmer_name(String farmer_name) {
        this.farmer_name = farmer_name;
    }

    public String getFarmer_email() {
        return farmer_email;
    }

    public void setFarmer_email(String farmer_email) {
        this.farmer_email = farmer_email;
    }

    public double getFarmer_phone() {
        return farmer_phone;
    }

    public void setFarmer_phone(double farmer_phone) {
        this.farmer_phone = farmer_phone;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "farmer_id=" + farmer_id +
                ", user_id=" + user_id +
                ", farmer_name='" + farmer_name + '\'' +
                ", farmer_email='" + farmer_email + '\'' +
                ", farmer_phone=" + farmer_phone +
                '}';
    }
}
