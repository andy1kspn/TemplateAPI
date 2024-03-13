package com.example.dezvoltareaaplicatiilorweb.repository;

import com.example.dezvoltareaaplicatiilorweb.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
}
