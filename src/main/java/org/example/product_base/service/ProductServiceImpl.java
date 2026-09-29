package org.example.product_base.service;

import org.example.product_base.entity.Product;
import org.example.product_base.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product addProduct(Product product) {
        Product newProduct = productRepo.save(product);
        return newProduct;
    }

    @Override
    public List<Product> getProduct() {
        List<Product> newProducts = productRepo.findAll();
        return newProducts;
    }
}
