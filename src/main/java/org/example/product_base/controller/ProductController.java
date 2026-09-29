package org.example.product_base.controller;

import org.example.product_base.entity.Product;
import org.example.product_base.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
     Product newProduct=productService.addProduct(product);
     return newProduct;
    }
    @GetMapping("/getProductData")
    public List<Product> getProductData(){
       List<Product> newProduct=productService.getProduct();
       return newProduct;
    }
}
