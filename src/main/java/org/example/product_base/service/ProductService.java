package org.example.product_base.service;

import org.example.product_base.entity.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    List<Product> getProduct();
}
