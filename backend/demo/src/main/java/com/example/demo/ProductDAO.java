package com.example.demo;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ProductDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Product> list(){
        String sql = "Select * From Product";
        List<Product> listProduct = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
        return listProduct;
    }

    public void save(Product product){
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("Product").usingColumns("product_name","product_price","stock_num","product_description","farmer_id");

        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(product);
        insertActor.execute(param);

    }

    public Product get(int id){
        String sql = "Select * From Product Where product_id = ? ";
        Object[] args = {id};
        Product product = jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Product.class));
        return product;
    }

    public void update(Product product){
        String sql = "Update Product Set product_name=:product_name, product_price=:product_price, stock_num=:stock_num, product_description =:product_description Where product_id=:product_id";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(product);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);

    }

    public void delete(int id){
        String sql = "Delete From Product Where product_id = ?";
        jdbcTemplate.update(sql,id);

    }

//    public List<Product> search(String name){
//        String sql = "SELECT farmer_name,farmer_id,COUNT(product_id) as p_count FROM Farmer NATURAL JOIN Product WHERE stock_num<=50 GROUP BY farmer_id;";
//        List<Product> searchProduct = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
//        return searchProduct;
//    }






}
