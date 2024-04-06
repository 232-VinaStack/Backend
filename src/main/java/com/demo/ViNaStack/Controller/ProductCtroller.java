package com.demo.ViNaStack.Controller;



import com.demo.ViNaStack.Model.Product;
import com.demo.ViNaStack.Repositories.ProductRepossitories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class ProductCtroller {

    @Autowired
    private ProductRepossitories repossitory;

    @GetMapping("")
    List<Product> getProducts() {
        return repossitory.findAll();
    }
}
