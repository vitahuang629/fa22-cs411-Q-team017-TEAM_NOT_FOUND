package com.example.demo.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private int user_id;
    private String password;
    public int getId(){
        return this.user_id;
    }
    public String getPassword(){
        return this.password;
    }
    public User(int user_id, String password) {
        this.user_id = user_id;
        this.password = password;
    }
}