package com.example.demo.controller;

import com.example.demo.*;
import com.example.demo.mapper.PlaceOrderDAO;
import com.example.demo.mapper.ProductyDAO;
import com.example.demo.pojo.CustomerOrder;
import com.example.demo.pojo.PlaceOrder;
import com.example.demo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class dbController {
    @Autowired
    private ProductyDAO productyDAO;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private PlaceOrderDAO placeOrderDAO;

    @Autowired
    private ResultMessage resultMessage;

//    @Autowired
//    private PlaceOrderDAO orderMapper;

    @Autowired
    private OrderService orderService;


    @GetMapping("/search")    //url: /search?id=
    public List<Product> listMaterial(@RequestParam("name") String name){
        return productyDAO.getProductByName(name);
//        return name;
    }


    @GetMapping("/userList")
    public List<Map<String,Object>> userList(){
        String sql = "SELECT * FROM user;";
        List<Map<String,Object>> lmaps = jdbcTemplate.queryForList(sql);
        return lmaps;
    }

    @GetMapping("/addUser")
    public String addStudent(){
        String sql = "INSERT INTO user(user_id,password) VALUES(4,'ff')";
        jdbcTemplate.update(sql);
        return "OK";
    }

    @GetMapping("/changepwd/{id}")
    public String changepwd(@PathVariable("id") int id){
        String sql = "UPDATE user SET password=? WHERE user_id="+id;

        Object[] objects = new Object[1];
        objects[0]="aaaaaachange";

        jdbcTemplate.update(sql,objects);
        return "OK";
    }

    @GetMapping("/search_product")    //url: /search?id=
    public String listMaterial(@RequestParam("id") int id){
        return placeOrderDAO.getOrderByCustomerId(id).toString();
    }

//    @GetMapping("/getOrder/{customer_id}")
//    public ResultMessage getOrder(@PathVariable("customer_id")  Integer customer_id) {
//        List<PlaceOrder> orders = orderService.getOrder(customer_id);
//        resultMessage.success("001", orders);
//        return resultMessage;
//    }

    @GetMapping("/getOrder")    //url: /search?id=
    public ResultMessage listMaterial(@RequestParam("id") Integer customer_id){
        List<CustomerOrder> orders = orderService.getOrder(customer_id);
        resultMessage.success("001", orders);
        return resultMessage;
    }

}
