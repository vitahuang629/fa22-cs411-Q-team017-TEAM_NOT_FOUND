package com.example.demo.mapper;

import com.example.demo.pojo.FarmerPro;
import com.example.demo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FarmerProDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public FarmerProDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<FarmerPro> list(){
        String sql = "SELECT farmer_id, ROW_NUMBER() OVER (PARTITION BY farmer_id\n" +
                " ORDER BY product_price) rank_1, product_name, product_price, AVG(product_price) OVER (PARTITION BY farmer_id) AS avgsales\n" +
                "FROM Product\n" +
                "order by farmer_id asc;";
        List<FarmerPro> listFarmerPro = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(FarmerPro.class));
        return listFarmerPro;
    }
}
