package com.example.productmicroservice.service;

import com.example.productmicroservice.entity.Product;
import com.example.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product findUserById(Long id) {
        return productRepository.findByProdId(id);
    }
}
