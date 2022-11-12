package com.example.demo.controller;

import com.example.demo.mapper.FarmerDAO;
import com.example.demo.pojo.FarmerProduct;
import com.example.demo.pojo.Product;
import com.example.demo.mapper.ProductDAO;
import com.example.demo.mapper.ProductyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private ProductDAO dao;

    @Autowired
    private FarmerDAO farmerdao;

    @Autowired
    private ProductyDAO productyDAO;

    @RequestMapping("/farmer")
    public String viewHomePage(Model model){
        List<Product> listProduct = dao.list();
        model.addAttribute("listProduct", listProduct);
        return "index";
    }

    @RequestMapping("/home")
    public String HomePage(){
        return "Site1/Home";
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
}
