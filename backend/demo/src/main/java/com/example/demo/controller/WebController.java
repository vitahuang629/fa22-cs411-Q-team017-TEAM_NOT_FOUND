package com.example.demo.controller;

import com.example.demo.OrderService;
import com.example.demo.ResultMessage;
import com.example.demo.mapper.*;
import com.example.demo.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class WebController {

    @Autowired
    private ProductDAO dao;

    @Autowired
    private FarmerDAO farmerdao;

    @Autowired
    private ProductyDAO productyDAO;

    @Autowired
    private OrderService orderService;

    @Autowired
    private PlaceOrderDAO placeOrderDAO;

    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private FarmerRankDAO farmerRankDAO;

    @Autowired
    private IncludeProductsDao includeProductsDao;

    @RequestMapping("/farmer")
    public String viewHomePage(Model model){
        List<Product> listProduct = dao.list();
        model.addAttribute("listProduct", listProduct);
        return "index";
    }

    @RequestMapping("/home")
    public String HomePage(){
        return "Home";
    }

    @RequestMapping("/new")
    public String showNewForm(Model model){
        Product product = new Product();
        model.addAttribute("product", product);

        return "newform";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("product") Product product){
        dao.save(product);

        return "redirect:/farmer";

    }

    @RequestMapping("/edit/{product_id}")
    public ModelAndView showEditForm(@PathVariable(name = "product_id") int product_id){
        ModelAndView mav = new ModelAndView("editform");
        Product product = dao.get(product_id);
        mav.addObject("product",product);
        return mav;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("product") Product product){
        dao.update(product);

        return "redirect:/farmer";

    }

    @RequestMapping("/delete/{product_id}")
    public String delete(@PathVariable(name = "product_id") int product_id){
        dao.delete(product_id);
        return "redirect:/farmer";
    }

    @RequestMapping("/notify")
    public String listRestock(Model model){
        List<FarmerProduct> listRestock = farmerdao.farmerlist();
        model.addAttribute("listRestock", listRestock);
        return "notify";

    }

    @RequestMapping("/getOrder")    //url: /search?id=
    public String listMaterial(@RequestParam("id") Integer customer_id, Model model){
        CustomerOrder orderSum = orderService.getOrderNum(customer_id);
        List<PlaceOrder> orders = orderService.getOrder(customer_id);
        String status = placeOrderDAO.getStatus(customer_id);

        String name=orderSum.getCustomer_name();
        Integer cnt=orderSum.getCnt();
        model.addAttribute("listProduct", orders);
        model.addAttribute("cnt",cnt);
        model.addAttribute("name",name);
        model.addAttribute("status",status);
        return "Shopping-history";
    }

    @GetMapping("/listCart")    //url: /search?id=
    public String listCart(@RequestParam("id") Integer customer_id,Model model){
        List<IncludeProducts> includeProducts = includeProductsDao.list(customer_id);

        double totalPrice = 0;
        for (IncludeProducts product : includeProducts) {
            totalPrice += product.getQuantity() * product.getPrice();
        }
        model.addAttribute("listShop",includeProducts);
        model.addAttribute("sum",totalPrice);
        return "Shopping-cart";

    }

    @RequestMapping("/productlist_{customer_id}")
    public String productList(Model model){
        List<Product> listProduct = dao.list();
        model.addAttribute("listProduct", listProduct);
        return "product";
    }

    @RequestMapping("/orderhistory")
    public String listOrder(Model model){
        List<Order> listOrder = orderDAO.listOrder();
        model.addAttribute("listOrder", listOrder);
        return "order";
    }

    @RequestMapping("/rank")
    public String prodfarmList(Model model){
        List<FarmerRank> listFarmerRank = farmerRankDAO.list();
        model.addAttribute("listFarmerrank", listFarmerRank);
        return "rank";
    }

}
