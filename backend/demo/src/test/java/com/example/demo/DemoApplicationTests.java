package com.example.demo;

import com.example.demo.mapper.ProductyDAO;
import com.example.demo.pojo.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ProductyDAO productyDAO;
	@Test
	void contextLoads() {
		List<Product> products = productyDAO.getProductByName("potato");
//		System.out.println(ids);
//		System.out.println();
		for (Product product:products){
			System.out.println(product.toString());
		}
	}

}
