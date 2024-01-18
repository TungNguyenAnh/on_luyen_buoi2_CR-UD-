package com.example.baitap1.controller;

import com.example.baitap1.model.Product;
import com.example.baitap1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public String showHomePage(Model model) {
        List<Product> lists = productService.getAllProducts();

        model.addAttribute("listProducts", lists);

        return "/product/list";
    }

    @GetMapping("/add-product")
    public String showProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);

        return "/product/create";
    }

    @PostMapping("/create")
    public String createProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {
        System.out.println(product);
        productService.createProduct(product);

        redirectAttributes.addFlashAttribute("message", "Create successfully");

        return "redirect:/products";
    }

}
