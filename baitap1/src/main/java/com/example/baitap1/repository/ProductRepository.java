package com.example.baitap1.repository;

import com.example.baitap1.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    List<Product> listProducts = new ArrayList<>();

    public ProductRepository() {
        Product product1 = new Product(1, "iphone X", "details iphone X", 10);
        Product product2 = new Product(2, "iphone 11", "details iphone 11", 11);
        Product product3 = new Product(3, "iphone 12", "details iphone 12", 12);


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

    public void update(int id, Product product) {
        Product product1 = findById(id);
        listProducts.remove(product1);
        createProduct(product);
    }

    public Product findById(int id) {
        return listProducts.get(id);
    }

    public void remove(int id) {
        Product product2 = findById(id);
        listProducts.remove(product2);
    }
}

