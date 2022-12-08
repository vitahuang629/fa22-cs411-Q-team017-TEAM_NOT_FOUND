package com.example.demo.controller;

import com.example.demo.*;
import com.example.demo.mapper.*;
import com.example.demo.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class dbController {
    @Autowired
    private ProductyDAO productyDAO;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private PlaceOrderDAO placeOrderDAO;

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private ResultMessage resultMessage1;

    @Autowired
    private ResultMessage resultMessage2;

//    @Autowired
//    private PlaceOrderDAO orderMapper;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ContainsDAO containsDAO;

    @Autowired
    private ContainsService containsService;

    @Autowired
    private IncludeProductsDao includeProductsDao;

    @Autowired
    private ResultMessage resultMessage;

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
        return placeOrderDAO.getOrderByCustomerIdAgg(id).toString();
    }

    @PostMapping("/cartToOrder")
    public String insertToOrder(@RequestBody ProductQuantity productQuantity) {
        Integer customer_id = productQuantity.getCustomer_id();
        float price = productQuantity.getPrice();
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
//        return date.toString();
        List<PlaceOrder> orderIds=placeOrderDAO.getOrderByCustomerId(customer_id);
        Integer order_id = orderIds.get(orderIds.size() - 1).getOrder_id()+1;
        PlaceOrder placeOrder = new PlaceOrder(order_id,customer_id,sqlDate,price);
        placeOrderDAO.insertOrder(placeOrder);
        includeProductsDao.clear(customer_id);

//        for (List product_quantity:productQuantity.getProduct_quantity()){
//
//            Contains contains = new Contains(Integer.parseInt(product_quantity.get(0).toString()),order_id,Integer.parseInt(product_quantity.get(1).toString()));
//            containsDAO.insertContains(contains);
//
//        }
        return "OK";
//        return price;
    }
    @GetMapping("/addCart/{product_id}/{price}/{customer_id}")
    public String addCart(@PathVariable Integer product_id, @PathVariable Double price,@PathVariable Integer customer_id)  {
        IncludeProducts includeProducts = new IncludeProducts(customer_id,product_id, 1,price);
        IncludeProducts one = includeProductsDao.selectOne(product_id);
//        System.out.println(includeProducts.toString());
        if (one != null) {
            System.out.println(one.toString());
            includeProductsDao.updateOne(product_id, one.getQuantity() + 1);
        } else {
            includeProductsDao.insertProduct(includeProducts);
        }
        return "OK";
    }



    @GetMapping("/deleteCart/{product_id}")
    public String deleteCart(@PathVariable Integer product_id){
        includeProductsDao.deleteOne(product_id);
        return "OK";
    }

    @GetMapping("/updateCart/{product_id}/{quantity}")
    public String updateCart(@PathVariable Integer product_id, @PathVariable Integer quantity) {
        includeProductsDao.updateOne(product_id, quantity);
        return "OK";
    }



}
