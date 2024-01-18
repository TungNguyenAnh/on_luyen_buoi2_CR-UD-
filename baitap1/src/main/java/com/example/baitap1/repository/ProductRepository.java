package com.example.baitap1.repository;

import com.example.baitap1.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    List<Product> listProducts = new ArrayList<>();

    public ProductRepository() {
        Product product1 = new Product("iphone X", "details iphone X", 10);
        Product product2 = new Product("iphone 11", "details iphone 11", 11);
        Product product3 = new Product("iphone 12", "details iphone 12", 12);

        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
    }

    public List<Product> getAllProduct() {
        return listProducts;
    }

    public void createProduct(Product product) {
        listProducts.add(product);
    }

}

