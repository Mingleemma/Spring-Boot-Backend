package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/product/{prodId}")
    public Product getProdById(@PathVariable int prodId){
        return service.getProdById(prodId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }
}
