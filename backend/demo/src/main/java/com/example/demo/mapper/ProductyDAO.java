package com.example.demo.mapper;

import com.example.demo.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductyDAO {
    @Select("SELECT * FROM Product WHERE product_name LIKE '%' #{product_name} '%' ")
    List<Product> getProductByName(String product_name);
}
