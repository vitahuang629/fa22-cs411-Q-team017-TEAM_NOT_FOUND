package com.example.demo;

import com.example.demo.mapper.ProductDAO;
import com.example.demo.pojo.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProductDAOTest {
    private ProductDAO dao;

    @BeforeEach
    void setUp() throws Exception{
        DriverManagerDataSource datasource= new DriverManagerDataSource();
        datasource.setUrl("jdbc:mysql://34.135.173.85:3306/teamtest");
        datasource.setUsername("root");
        datasource.setPassword("1234");
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dao = new ProductDAO(new JdbcTemplate(datasource));
    }
    @Test
    void testList(){
        List<Product> listProduct = dao.list();
        assertFalse(listProduct.isEmpty());

    }

//    @Test
//    void testSave(){
//        Product product = new Product("banana",0.99,1000,"I love banana.");
//        dao.save(product);
//    }

    @Test
    void testGet(){
        int id = 8;
        Product product = dao.get(id);
        assertNotNull(product);
    }

    @Test
    void testUpdate(){
        Product product = new Product();
        product.setProduct_id(10);
        product.setProduct_name("Apple");
        product.setProduct_price(6.99);
        product.setStock_num(355);
        product.setProduct_description("An apple a day, keeps doctor away.");

        dao.update(product);
    }

    @Test
    void testDelete(){
        int product_id = 12;
        dao.delete(product_id);
    }
}
