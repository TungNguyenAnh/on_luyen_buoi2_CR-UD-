package com.example.baitap1.controller;

import com.example.baitap1.model.Product;
import com.example.baitap1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
        int id = (int) (Math.random() * 100);
        product.setId(id);
        productService.createProduct(product);
        redirectAttributes.addFlashAttribute("message", "Create successfully");
        return "redirect:/products";
    }

    @GetMapping("/edit-product/{count}")
    public String editProductForm(@PathVariable int count, Model model) {
        int id = count - 1;
        Product product = productService.findById(id);
        product.setId(id);
        model.addAttribute("product", product);
        return "/product/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Product product) {
        productService.update(product.getId() ,product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{count}")
    public String delete(@PathVariable String count, Model model) {
        int id = Integer.parseInt(count) - 1;
        productService.remove(id);
        return "redirect:/products";
    }

}
