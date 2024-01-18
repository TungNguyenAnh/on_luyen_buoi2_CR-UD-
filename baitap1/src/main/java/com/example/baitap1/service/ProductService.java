package com.example.baitap1.service;

import com.example.baitap1.model.Product;
import com.example.baitap1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.getAllProduct();
    }

    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }

    public void delete(Long id) {
    }
}
