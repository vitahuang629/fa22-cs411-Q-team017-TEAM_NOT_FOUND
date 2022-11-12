package com.example.demo.mapper;

import com.example.demo.pojo.Farmer;
import com.example.demo.pojo.FarmerProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FarmerDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public FarmerDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Farmer> list(){
        String sql = "Select * From Farmer";
        List<Farmer> listFarmer = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Farmer.class));
        return listFarmer;
    }

    public List<FarmerProduct> farmerlist(){
        String sql = "SELECT farmer_name,farmer_id,COUNT(product_id) as p_count FROM Farmer NATURAL JOIN Product WHERE stock_num<=50 GROUP BY farmer_id";
        List<FarmerProduct> farmerlist = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(FarmerProduct.class));
        return farmerlist;

    }

    public void save(Farmer farmer){

    }

    public Farmer get(int farmer_id){
        return null;
    }


    public void update(Farmer farmer){

    }

    public void delete(int farmer_id){

    }


}