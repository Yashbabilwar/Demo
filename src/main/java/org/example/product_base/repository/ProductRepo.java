package org.example.product_base.repository;

import org.example.product_base.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long>{


}
