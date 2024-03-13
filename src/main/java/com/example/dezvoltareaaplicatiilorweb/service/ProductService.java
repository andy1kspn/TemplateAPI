package com.example.dezvoltareaaplicatiilorweb.service;

import com.example.dezvoltareaaplicatiilorweb.entity.Product;
import com.example.dezvoltareaaplicatiilorweb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
