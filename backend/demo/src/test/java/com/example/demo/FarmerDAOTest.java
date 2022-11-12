package com.example.demo;

import com.example.demo.mapper.FarmerDAO;
import com.example.demo.pojo.Farmer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class FarmerDAOTest {

    private FarmerDAO farmerdao;

    @BeforeEach
    void setUp() throws Exception{
        DriverManagerDataSource datasource= new DriverManagerDataSource();
        datasource.setUrl("jdbc:mysql://34.135.173.85:3306/team017");
        datasource.setUsername("root");
        datasource.setPassword("1234");
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        farmerdao = new FarmerDAO(new JdbcTemplate(datasource));
    }

    @Test
    void testList(){
        List<Farmer> listFarmer = farmerdao.list();
        assertFalse(listFarmer.isEmpty());

    }
}
