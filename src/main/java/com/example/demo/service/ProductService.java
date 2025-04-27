package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProdById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product) {
        repo.save(product);
    }
}
